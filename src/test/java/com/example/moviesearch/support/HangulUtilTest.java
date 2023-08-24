package com.example.moviesearch.support;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HangulUtilTest {

    @Test
    void name() {
        Assertions.assertThat(HangulUtil.inspectSpell("ㅇㄶㅅㅇ")).isEqualTo("ㅇㄴㅎㅅㅇ");
    }
}