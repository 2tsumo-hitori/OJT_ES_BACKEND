package com.example.moviesearch.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

import static com.fasterxml.jackson.annotation.JsonInclude.Include.NON_EMPTY;

@Getter
@Setter
@ToString
@JsonInclude(NON_EMPTY)
public class Movie {

    private String repNationNm;

    private List<Directors> directors = new ArrayList<>();

    private String nationAlt;

    private String repGenreNm;

    private String movieNm;

    private Integer prdtYear;

    private String typeNm;

    private String movieNmEn;
}
