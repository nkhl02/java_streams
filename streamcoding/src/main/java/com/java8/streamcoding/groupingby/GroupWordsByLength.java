package com.java8.streamcoding.groupingby;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupWordsByLength {

    List<String> list = new ArrayList<>(List.of("apple","group","dance","france","abc","xyz","pqr","peackock"));
    Map<Integer, List<String>> result = new HashMap<>();
    public void groupWordsByLength(){
        result = list.stream().collect(Collectors.groupingBy(s->s.length()));
        System.out.println(result);
    }

}
