package com.java8.streamcoding.allmatch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CheckIfAllNumbersArePositive {

    List<Integer> list = new ArrayList<>(List.of(1,34,-2,22,3,21));

    public void checkAllNumbersPositive(){
        boolean result = list.stream()
                .allMatch(a->a>=0);
        System.out.println(result);
    }


}
