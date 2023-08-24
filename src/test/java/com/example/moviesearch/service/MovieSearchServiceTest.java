package com.example.moviesearch.service;

import com.example.moviesearch.dto.TargetResponse;
import com.example.moviesearch.entity.Movie;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.IOException;

@SpringBootTest
class MovieSearchServiceTest {

    @Autowired
    MovieSearchService movieSearchService;

    @Test
    void name() throws IOException {
        var response = movieSearchService.searchByChosung("ㅇㄶㅅㅇ", Movie.class);
    }
}