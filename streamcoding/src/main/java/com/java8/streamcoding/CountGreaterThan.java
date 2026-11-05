package com.java8.streamcoding;

import java.util.Arrays;

public class CountGreaterThan {
    Integer[] arr = {2,43,5,75,10,2,4,34};

    public void countGreaterThan(){

        long count = Arrays.stream(arr).filter(a->a>10)
                .count();
        System.out.println(count);
    }
}
