package com.java8.streamcoding;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;

@Service
public class HowCreateStreams {
    List<Integer> list = new ArrayList<>(List.of(12,13,24));
    Integer[] arr = {12,13,35};

    Stream<Integer> streamInt = Stream.empty();
    Stream<Double> streamDouble = Stream.empty();
    public void createStreams(){

        // 1. list to stream.
        streamInt = list.stream();
        streamInt.forEach(System.out::println);
        System.out.println();

        // 2. Array to stream
        streamInt = Arrays.stream(arr);
        streamInt.forEach(System.out::println);
        System.out.println();

        // 3. Using Stream.of.
        streamInt = Stream.of(2,4,79);
        streamInt.forEach(System.out::println);
        System.out.println();

        // 4. Using Stream generate
        streamDouble = Stream.generate(Math::random).limit(1);
        streamDouble.forEach(System.out::println);
        System.out.println();

    }
}
