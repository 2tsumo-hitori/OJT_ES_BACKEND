package com.example.moviesearch.dto;

import com.example.moviesearch.entity.Movie;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
public class MovieSearchResponse {
    private List<Movie> movies;
}
