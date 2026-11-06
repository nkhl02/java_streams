package com.java8.streamcoding.groupingby;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountOccurenceOfEachElement {

    List<String> list = new ArrayList<>(List.of("apple","group","dance","group","france","abc","peackock","peackock","apple","xyz","pqr","peackock"));
    Map<String, Long> result = new HashMap<>();

    public void getOccurenceOfEachElement() {
        result = list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(result);
    }
}
