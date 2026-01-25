package com.cfs.bookMyshow.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.*;

import java.time.LocalDate;

@Entity
@Table(name="payments")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable=false, unique=true)
    private String transactionId;
    @Column(nullable=false)
    private Double amount;

    @Column(nullable=false)
    private LocalDate paymentTime;

    @Column(nullable=false)
    private String paymentMethod;

    @Column(nullable=false)
    private String status; // success,fail,pending

    @OneToOne(mappedBy = "payment")
    private Booking booking;


}
