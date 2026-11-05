package com.java8.streamcoding.reduce;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SumOfEvenNumbers {
    List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));


    public void sumOfEvenNumbers(){

        Integer result = list.stream()
                .filter(a->a%2==0)
                .reduce(0,(a,b)->a+b);
        System.out.println(result);
    }

}
