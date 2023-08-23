package com.example.moviesearch.service;

import com.example.moviesearch.dto.MovieSearchResponse;
import lombok.RequiredArgsConstructor;
import org.elasticsearch.action.search.SearchResponse;
import org.springframework.stereotype.Service;

import java.io.IOException;

import static com.example.moviesearch.support.JsonToObject.*;

@Service
@RequiredArgsConstructor
public class MovieSearchService {
    private final MovieSearchQueryBuilder movieSearchQueryBuilder;
    public MovieSearchResponse searchByChosung(String chosung) throws IOException {
        SearchResponse response = movieSearchQueryBuilder.getAutoCompleteByChosung(chosung);

        return objectBuilder(response);
    }
}
