package com.java8.streamcoding.primitivemathoperations;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class FindAverageOfNumbers {
    List<Integer> list = new ArrayList<>(List.of(1,2,3,4,5,6,7,8,9,10));

    public void findAverageOfNumbers(){
        double result = list.stream()
                .mapToInt(Integer::intValue)
                        .average()
                        .orElse(0.0);

        System.out.println(result);

    }
}
