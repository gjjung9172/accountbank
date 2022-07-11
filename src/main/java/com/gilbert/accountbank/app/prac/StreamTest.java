package com.gilbert.accountbank.app.prac;

import lombok.extern.slf4j.Slf4j;

import java.util.stream.Stream;

@Slf4j
public class StreamTest {

    public static void main(String[] args) {

//        List<Integer> list = new ArrayList<>();
//        list.add(1);
//        list.add(2);
//        list.add(3);
//        list.add(4);
//
//        Stream<Integer> stream = list.stream();
//        stream.forEach(System.out::println);

//        String[] arr = new String[]{"one", "two", "three", "four"};
//
//        Stream<String> stream = Arrays.stream(arr);
//
//        stream.forEach(e -> System.out.print(e + ""));
//        System.out.println();

        // 가변 매개변수
        Stream<Double> stream = Stream.of(1.2,1.3,1.4);
        stream.forEach(System.out::println);
        log.info("test logging");

    }
}
