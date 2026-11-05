package com.java8.streamcoding.string;

import com.sun.source.tree.BreakTree;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class FindFirstNonEmptyElement {
    List<String> list = new ArrayList<>(List.of("","Apple","Sail","Bananaa","Soap","Paris","Book","Sleep","Soap"));

    public void findFirstNonEmpty(){
        Optional<String> result = list.stream()
                .filter(s->!s.isEmpty())
                .findFirst();
        if(result.isPresent()){
            System.out.println(result.get());
        }

    }
}
