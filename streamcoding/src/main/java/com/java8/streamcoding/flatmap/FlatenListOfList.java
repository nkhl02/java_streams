package com.java8.streamcoding.flatmap;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FlatenListOfList {
    List<List<Integer>> list = List.of(List.of(1,2,3,4,5),List.of(3,4,5,6),List.of(23,3,1,45,0));

    public void flattenList(){
        List<Integer> result = list.stream().flatMap(List::stream).toList();
        System.out.println(result);
    }
}
