package com.cfs.bookMyshow.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.*;

import java.util.List;

@Entity
@Table(name="movies")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Movie {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Column(nullable=false)
    private String title;
    private String description;
    private String language;
    private String genre;
    private String durationMins;
    private String releaseDate;
    private String posterUrl;
    // this is the refer to show and Show having foregin key of Movies
    @OneToMany(mappedBy = "movie", cascade=CascadeType.ALL)
    private List<Show> shows;


}
