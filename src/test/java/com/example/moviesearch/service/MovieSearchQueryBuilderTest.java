package com.example.moviesearch.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.IOException;

@SpringBootTest
class MovieSearchQueryBuilderTest {

    @Autowired
    MovieSearchQueryBuilder movieSearchQueryBuilder;

    @Test
    void acComplete() throws IOException {
        movieSearchQueryBuilder.getAutoCompleteByChosung("ㅁㄴㅌ");
    }
}