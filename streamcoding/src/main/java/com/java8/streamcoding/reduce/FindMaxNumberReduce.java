package com.java8.streamcoding.reduce;

import java.util.Arrays;
import java.util.Optional;

public class FindMaxNumberReduce {
    Integer[] arr = {2, 4, 1, 6, 33, 21, 55, 32, 10, 21, 3, 1, 0};

    public void findMaxNumberByReduce() {

        Optional<Integer> max = Arrays.stream(arr).reduce(Integer::max);
        if (max.isPresent()) {
            System.out.println(max.get());
        }
    }
}