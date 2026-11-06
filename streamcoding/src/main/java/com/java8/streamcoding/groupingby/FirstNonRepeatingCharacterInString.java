package com.java8.streamcoding.groupingby;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatingCharacterInString {

    private String str = "alaska";

    public void findFirstNonRepeatingChar(){

        Map.Entry<Character, Long> map = str.chars()
                .mapToObj(c->(char)c)
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        LinkedHashMap::new,
                        Collectors.counting()
                )).entrySet()
                .stream()
                .filter(a->a.getValue()==1)
                .findFirst()
                .orElseThrow();

        System.out.println(map.getKey());

    }

}
