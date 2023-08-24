package com.example.moviesearch.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import static com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL;

@Getter
@Setter
@ToString
@JsonInclude(NON_NULL)
public class Directors {

    private String peopleNm;
}
