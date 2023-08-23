package com.example.moviesearch.service;

import com.example.moviesearch.dto.MovieSearchResponse;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class MovieSearchServiceTest {

    @Autowired
    MovieSearchService movieSearchService;

    @Test
    void name() throws IOException {
        MovieSearchResponse response = movieSearchService.searchByChosung("ㅁㄴㅌ");

        System.out.println(response);
    }
}