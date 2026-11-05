package com.java8.streamcoding.string;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class CountHowManyStringsStartsWith {
    List<String> list = new ArrayList<>(List.of("Apple","Sail","Bananaa","Soap","Paris","Book","Sleep","Soap"));

    public void countStringsStartingWith(){
               long count = list.stream()
                        .filter(a->a.toLowerCase().startsWith("s"))
                        .count();

               System.out.println(count);
    }
}
