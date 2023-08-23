package com.example.moviesearch.service;

import lombok.RequiredArgsConstructor;
import org.elasticsearch.action.search.SearchRequest;
import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.client.RequestOptions;
import org.elasticsearch.client.RestHighLevelClient;
import org.elasticsearch.index.query.BoolQueryBuilder;
import org.elasticsearch.search.builder.SearchSourceBuilder;
import org.elasticsearch.search.sort.SortOrder;
import org.springframework.stereotype.Component;

import java.io.IOException;

import static com.example.moviesearch.support.Index.MY_MOVIE_SEARCH;

@Component
@RequiredArgsConstructor
public class QuerySourceBuilder {
    private final RestHighLevelClient esClient;

    public SearchResponse build(BoolQueryBuilder boolQueryBuilder) throws IOException {
        SearchSourceBuilder searchSourceBuilder = SearchSourceBuilder.searchSource().query(boolQueryBuilder);

        searchSourceBuilder
                .sort("movieNmCount", SortOrder.ASC)
                .fetchSource("movieNm", null);

        SearchRequest searchRequest = new SearchRequest(MY_MOVIE_SEARCH);

        searchRequest.source(searchSourceBuilder);

        return esClient.search(searchRequest, RequestOptions.DEFAULT);
    }
}
