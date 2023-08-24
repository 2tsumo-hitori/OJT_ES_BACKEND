package com.example.moviesearch.controller;

import com.example.moviesearch.service.MovieSearchService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@SpringBootTest
@AutoConfigureMockMvc
class MovieSearchControllerTest {

    @Autowired
    MockMvc mockMvc;

    @Test
    void name() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/api/search/ㅁㄴㅇ").contentType(MediaType.APPLICATION_JSON)).andExpect(status().isOk());
    }
}