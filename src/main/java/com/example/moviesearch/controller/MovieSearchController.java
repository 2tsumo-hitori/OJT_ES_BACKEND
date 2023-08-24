package com.example.moviesearch.controller;

import com.example.moviesearch.entity.Movie;
import com.example.moviesearch.service.MovieSearchService;
import com.example.moviesearch.support.HangulUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/search")
public class MovieSearchController {

    private final MovieSearchService movieSearchService;

    @GetMapping("/{word}")
    public ResponseEntity<?> movieSearch(@PathVariable String word) throws IOException {
        return ResponseEntity.ok(movieSearchService.searchByChosung(HangulUtil.inspectSpell(word), Movie.class));
    }
}
