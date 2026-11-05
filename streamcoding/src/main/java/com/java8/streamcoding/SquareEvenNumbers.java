package com.java8.streamcoding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SquareEvenNumbers {

    List<Integer> list = new ArrayList<>(List.of(1,2,3,4,5,6,7,8,9,10));
    List<Integer> list2 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));

    public void squareEvenNumbers(){
     List<Integer> resultList = list.stream().filter(item->item%2==0)
                .map(a->a*a)
                .collect(Collectors.toList());
        System.out.println(resultList);
    }
}
