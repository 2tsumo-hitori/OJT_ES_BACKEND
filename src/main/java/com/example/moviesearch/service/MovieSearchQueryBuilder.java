package com.example.moviesearch.service;

import lombok.RequiredArgsConstructor;
import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.index.query.BoolQueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
@RequiredArgsConstructor
public class MovieSearchQueryBuilder {
    private final QuerySourceBuilder querySourceBuilder;

    public SearchResponse getAutoCompleteByChosung(String chosung) throws IOException {
        BoolQueryBuilder boolQueryBuilder = QueryBuilders.boolQuery();

        boolQueryBuilder
                .must(QueryBuilders.boolQuery()
                        .should(QueryBuilders.matchQuery("movieNm_chosung_front", chosung))
                        .should(QueryBuilders.matchQuery("movieNm_chosung_back", chosung)))
                .should(QueryBuilders
                        .rangeQuery("movieNmCount")
                        .lte(chosung.length()));

        return querySourceBuilder.build(boolQueryBuilder);
    }
}
