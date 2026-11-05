package com.java8.streamcoding.string;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class JoinAllStringIntoCommaSeperatedString {

    List<String> list = new ArrayList<>(List.of("Apple","Sail","Bananaa","Soap","Paris","Book","Sleep","Soap"));

    public void joinCommaSeperated(){
        String result= list.stream()
                .map(s->"[" + s + "]")
                .collect(Collectors.joining(",","[","]"));
        System.out.println(result);
    }

}
