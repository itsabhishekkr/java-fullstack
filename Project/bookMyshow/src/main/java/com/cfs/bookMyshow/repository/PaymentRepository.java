package com.cfs.bookMyshow.repository;

import com.cfs.bookMyshow.model.Booking;
import com.cfs.bookMyshow.model.Movie;
import com.cfs.bookMyshow.model.Payment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PaymentRepository extends JpaRepository<Payment,Long> {
    Optional<Payment> findByTransactionId(Long transactionId);

}