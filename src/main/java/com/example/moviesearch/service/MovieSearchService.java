package com.example.moviesearch.service;

import com.example.moviesearch.dto.TargetResponse;
import lombok.RequiredArgsConstructor;
import lombok.val;
import org.elasticsearch.action.search.SearchResponse;
import org.springframework.stereotype.Service;

import java.io.IOException;

import static com.example.moviesearch.support.JsonToObject.*;

@Service
@RequiredArgsConstructor
public class MovieSearchService {

    private final MovieSearchQueryBuilder movieSearchQueryBuilder;

    public <T> TargetResponse<T> searchByChosung(final String chosung, final Class<T> targetType) throws IOException {
        val response = movieSearchQueryBuilder.getAutoCompleteByChosung(chosung);

        return objectBuilder(response, targetType);
    }
}
