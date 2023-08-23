package com.example.moviesearch.support;

import com.example.moviesearch.dto.MovieSearchResponse;
import com.example.moviesearch.entity.Movie;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.search.SearchHit;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
public class JsonToObject {
    private static final ObjectMapper objectMapper = new ObjectMapper();

    public static MovieSearchResponse objectBuilder(SearchResponse searchResponse) throws JsonProcessingException {
        SearchHit[] hits = searchResponse.getHits().getHits();

        MovieSearchResponse movieSearchResponse = new MovieSearchResponse();

        List<Movie> movies = new ArrayList<>();

        for (SearchHit hit : hits) {
            Movie movie = objectMapper.readValue(hit.getSourceAsString(), Movie.class);

            movies.add(movie);
        }

        movieSearchResponse.setMovies(movies);

        return movieSearchResponse;
    }
}
