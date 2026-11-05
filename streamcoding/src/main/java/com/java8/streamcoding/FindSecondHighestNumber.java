package com.java8.streamcoding;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class FindSecondHighestNumber {
    List<Integer> list = new ArrayList<>(List.of(2,7,3,6,12,42,54,23));

    public void findSecondHighest(){
        Optional<Integer> result = list.stream()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst();
        if(result.isPresent()){
            System.out.println(result.get());
        }

    }
}
