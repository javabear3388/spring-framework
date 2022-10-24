package com.springdemo.entity;

import com.springdemo.enums.MovieState;
import com.springdemo.enums.MovieType;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Entity
@NoArgsConstructor
@Data
public class Movie extends BaseEntity{

    private String name;
    @Column(columnDefinition = "Date")
    private LocalDate releaseDate;
    private Integer durations;
    @Column(columnDefinition = "text") //no limits on the characters
    private String summary;
    @Enumerated(EnumType.STRING)
    private MovieType type;
    @Enumerated(EnumType.STRING)
    private MovieState state;
    private BigDecimal price;

    @ManyToMany
    @JoinTable(name = "movie_fenre_rel",
    joinColumns = @JoinColumn(name="movie_id"),
            inverseJoinColumns = @JoinColumn(name="genre_id"))
    private List<Genre> genreList;


}
