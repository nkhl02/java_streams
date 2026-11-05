package com.java8.streamcoding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProductOfAllNumbers {

    List<Integer> list = new ArrayList<>(Arrays.asList(1,2,4,5,3,2));
    Integer result = 1;
    public void productOfAllNumbers(){
        list.stream().forEach(a-> result=a*result);
        System.out.println(result);
    }
}
