package com.java8.streamcoding.partitioningby;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SeperateEvenAndOdd {
    List<Integer> list = new ArrayList<>(List.of(1,2,3,4,5,6,7,8,9,10));

    public void seperateOddAndEven(){
        Map<Boolean,List<Integer>> result = new HashMap<>();

        result = list.stream().collect(Collectors.partitioningBy(n->n%2==0));
        System.out.println(result.get(true));
        System.out.println(result.get(false));
    }
}
