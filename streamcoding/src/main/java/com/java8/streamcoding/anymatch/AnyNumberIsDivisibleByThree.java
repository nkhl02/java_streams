package com.java8.streamcoding.anymatch;

import java.util.Arrays;

public class AnyNumberIsDivisibleByThree {
    Integer[] arr = {2,3,4,5,67,54,60,10};

    public void anyNumberDivisibleByThree(){
        boolean result = Arrays.stream(arr)
                .anyMatch(n->n%3==0);
        System.out.println(result);
    }


}
