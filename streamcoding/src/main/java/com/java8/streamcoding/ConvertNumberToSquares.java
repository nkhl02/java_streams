package com.java8.streamcoding;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConvertNumberToSquares {

    Integer[] arr = {2,3,8,23};

    public void printSquare(){
        List<Integer> result = Arrays.stream(arr).map(a->a*a).collect(Collectors.toList());
        System.out.println(result);
    }

}
