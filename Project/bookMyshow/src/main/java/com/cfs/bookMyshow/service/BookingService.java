package com.cfs.bookMyshow.service;

import com.cfs.bookMyshow.dto.BookingDto;
import com.cfs.bookMyshow.dto.BookingRequestDto;
import com.cfs.bookMyshow.exception.ResourceNotFoundException;
import com.cfs.bookMyshow.exception.SeatUnavailableException;
import com.cfs.bookMyshow.model.*;
import com.cfs.bookMyshow.repository.ShowRepository;
import com.cfs.bookMyshow.repository.ShowSeatRepository;
import com.cfs.bookMyshow.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Service
public class BookingService {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private ShowRepository showRepository;
    @Autowired
    private ShowSeatRepository showSeatRepository;
    @Autowired
    private ShowRepository showRepository;

    public BookingDto createBooking(BookingRequestDto bookingRequest) {
        User user = userRepository.findById(bookingRequest.getUserId()).orElseThrow(()-> new ResourceNotFoundException("User not found"));

        Show show = showRepository.findById(bookingRequest.getShowId()).orElseThrow(()-> new ResourceNotFoundException("Show not found"));

        List<ShowSeat> selectedSeats= showSeatRepository.findAllById(bookingRequest.getSeatIds());

        for(ShowSeat seat:selectedSeats){
            if(!"AVAILABAL".equals(seat.getStatus())){
                SeatUnavailableException seatUnavailableException = new SeatUnavailableException("seat" + seat.getSeat().getSeatNumber() + " is not available");
                return seatUnavailableException;
            }
            seat.setStatus("LOCKED");
        }
        showSeatRepository.saveAll(selectedSeats);
        Double totalAmount = selectedSeats.stream().mapToDouble(ShowSeat::getPrice).sum();
        Payment payment = new Payment();
        payment.setAmount(totalAmount);
        payment.setPaymentMethod(bookingRequest.getPaymentMethod());
        payment.setStatus("SUCCESS");
        payment.setTransactionId(UUID.randomUUID().toString());

        // booking

        Booking booking = new Booking();
        booking.setUser(user);
        booking.setShow(show);
        booking.setBookingTime(LocalDateTime.now());
        booking.setStatus("CONFIRMED");
        booking.setTotalAmount(totalAmount);
        booking.setBookingNumber(UUID.randomUUID().toString());
        booking.setPayment(payment);

    }



}
