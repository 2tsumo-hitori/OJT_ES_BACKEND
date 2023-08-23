package com.example.moviesearch.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@ToString
public class Movie {

    private String repNationNm;

    private List<Directors> directors = new ArrayList<>();

    private String nationAlt;

    private String repGenreNm;

    private String movieNm;

    private int prdtYear;

    private String typeNm;

    private String movieNmEn;
}
