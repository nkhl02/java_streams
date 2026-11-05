package com.java8.streamcoding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterEvenNumbers {

    List<Integer> list = new ArrayList<>(List.of(1,2,57,4,37,74,64));

    public void filterEvenNumbers(){

        List<Integer> evenList = list.stream().filter(item->item%2==0).collect(Collectors.toList());
        evenList.forEach(System.out::println);
    }

}
