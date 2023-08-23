package com.example.moviesearch.support;

import com.example.moviesearch.dto.TargetResponse;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import lombok.val;
import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.search.SearchHit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RequiredArgsConstructor
public class JsonToObject {

    private static final ObjectMapper objectMapper = new ObjectMapper();

    public static <T> TargetResponse<T> objectBuilder(final SearchResponse searchResponse, final Class<T> targetType) {
        val hits = searchResponse.getHits().getHits();

        val items = new ArrayList<T>();

        Arrays.stream(hits).forEach(hit -> {
            try {
                items.add(objectMapper.readValue(hit.getSourceAsString(), targetType));
            } catch (JsonProcessingException e) {
                throw new RuntimeException(e);
            }
        });

        return new TargetResponse<>(items);
    }
}
