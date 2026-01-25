package com.cfs.bookMyshow.controller;

import com.cfs.bookMyshow.dto.BookingDto;
import com.cfs.bookMyshow.dto.BookingRequestDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/bookings")
public class BookingController {
    public ResponseEntity<BookingDto> createBooking(@Validated @RequestBody BookingRequestDto bookingRequest) {
//        return new ResponseEntity<>(BookingService.createBooking(bookingRequest), HttpStatus.CREATED);

        return null;
    };
}
