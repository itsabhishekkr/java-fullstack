package com.cfs.bookMyshow.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name="theaters")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Theater {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String address;
    private String city;
    private Integer totalSeats;

    @OneToMany(mappedBy = "theater",cascade = CascadeType.ALL)
    private List<Screen> screens;


}
