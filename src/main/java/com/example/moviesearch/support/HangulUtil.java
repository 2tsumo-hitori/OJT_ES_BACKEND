package com.example.moviesearch.support;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class HangulUtil {
    private static final Map<String, String> CHOSUNG_MAP = new HashMap<>() {
        {
            put("ㄳ", "ㄱㅅ");
            put("ㄵ", "ㄴㅈ");
            put("ㄶ", "ㄴㅎ");
            put("ㄺ", "ㄹㄱ");
            put("ㄻ", "ㄹㅁ");
            put("ㄼ", "ㄹㅂ");
            put("ㄽ", "ㄹㅅ");
            put("ㄾ", "ㄹㅌ");
            put("ㄿ", "ㄹㅍ");
            put("ㅀ", "ㄹㅎ");
            put("ㅄ", "ㅂㅅ");
        }
    };

    private static final Set<Character> CHECK_CHOSUNG = new HashSet<>() {
        {
            add(' ');
            add('ㄱ');
            add('ㄴ');
            add('ㄷ');
            add('ㄹ');
            add('ㅁ');
            add('ㅂ');
            add('ㅅ');
            add('ㅇ');
            add('ㅈ');
            add('ㅊ');
            add('ㅋ');
            add('ㅌ');
            add('ㅍ');
            add('ㅎ');
            add('ㄲ');
            add('ㄸ');
            add('ㅃ');
            add('ㅆ');
            add('ㅉ');
            add('ㄳ');
            add('ㄵ');
            add('ㄶ');
            add('ㄺ');
            add('ㄻ');
            add('ㄼ');
            add('ㄽ');
            add('ㄾ');
            add('ㄿ');
            add('ㅀ');
            add('ㅄ');
        }
    };

    public static String inspectSpell(String word) {
        char[] words = word.toCharArray();

        for (char spell : words) {
            if (!CHECK_CHOSUNG.contains(spell))
                return null;
        }

        return fixSpell(word);
    }

    private static String fixSpell(String word) {
        String[] words = word.split("");

        for (int i = 0; i < words.length; i++) {
            if (CHOSUNG_MAP.containsKey(words[i])) {
                words[i] = CHOSUNG_MAP.get(words[i]);
            }
        }

        return String.join("", words);
    }

}
