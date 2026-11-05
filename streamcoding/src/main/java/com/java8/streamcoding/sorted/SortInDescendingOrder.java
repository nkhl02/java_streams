package com.java8.streamcoding.sorted;

import java.util.ArrayList;
import java.util.List;

public class SortInDescendingOrder {
    List<Integer> list = new ArrayList<>(List.of(2,5,9,56,2,12,3,7,4,100,123));

    public void sortDescending(){
        List<Integer> result = list.stream().sorted((a,b)->b-a).toList();
        System.out.println(result);
    }
}
