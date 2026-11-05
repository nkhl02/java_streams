package com.java8.streamcoding;

import java.util.Arrays;
import java.util.Optional;

public class FindFirstNumberGreaterThan {

    Integer[] arr = {2,15,3,24,5,1,45,43,13,4};

    public void findFirstNumberGreaterThan(){
        Optional<Integer> num = Arrays.stream(arr)
                .filter(a->a>10)
                .sorted()
                .findFirst();
        num.ifPresent(System.out::println);

    }

}
