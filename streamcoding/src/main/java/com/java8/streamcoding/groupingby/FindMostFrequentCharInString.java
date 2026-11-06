package com.java8.streamcoding.groupingby;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindMostFrequentCharInString {

    private String str = "banana";

    public FindMostFrequentCharInString(){};

    public void findMostFrequentChar(){

        Map.Entry<Character, Long> res = str.chars()
                .mapToObj(c->(char)c)
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        Collectors.counting()
                )).entrySet().stream()
                .max(Comparator.comparing(Map.Entry::getValue))
                .orElseThrow();


        System.out.println(res.getKey());
    }

}
