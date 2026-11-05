package com.java8.streamcoding.sorted;

import java.util.Arrays;
import java.util.Optional;

public class FindMaxNumber {
    Integer[] arr = {2,4,1,6,33,21,55,32,10,21,3,1,0};

    public void findMaxNumber(){
        Optional<Integer> max = Arrays.stream(arr)
                .sorted((a,b)->b-a)
                .findFirst();
        if(max.isPresent()){
            System.out.println(max.get());
        }

    }
}
