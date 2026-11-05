package com.java8.streamcoding.distinct;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FindAllTheDisctinctElements {
    List<Integer> list = new ArrayList<>(List.of(2,4,21,3,4,2,4,76,24,3,12,76));

    // Approach 1 use set (Drawback of this approach it does not maintain order)
    public void findDistinctUsingSet(){
        Set<Integer>result = list.stream().collect(Collectors.toSet());
        System.out.println(result);
    }

    public void findDistinct(){
       List<Integer> result =  list.stream().distinct().toList();
        System.out.println(result);
    }

}
