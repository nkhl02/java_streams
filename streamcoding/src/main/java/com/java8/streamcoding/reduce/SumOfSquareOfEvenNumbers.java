package com.java8.streamcoding.reduce;
import java.util.*;

public class SumOfSquareOfEvenNumbers {
    List<Integer> list = new ArrayList<>(List.of(1,2,3,4,5,6,7,8,9,10));

    public void sumOfSquareOfEvenNumbers(){

        Integer result = list.stream()
                .filter(a->a%2==0)
                .map(a->a*a)
                .reduce(0,Integer::sum);
        System.out.println(result);

    }
}
