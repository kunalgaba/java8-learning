package com.j8.gaba.j8learning;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.*;

@SpringBootApplication
public class J8LearningApplication {

    public static void main(String[] args) {
        //SpringApplication.run(J8LearningApplication.class, args);

        //Given a list of numbers, find the even numbers, double them and print the output
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        numbers.stream()
               .filter(e -> e % 2 == 0)
               .map(e -> e * 2)
               .forEach(System.out::println);

        //Given a String, find a pattern of text and replace it with an input String
        Map<String, String> properties = new HashMap<String, String>();
        properties.put("firstname", "Kunal");
        properties.put("lastname", "Gaba");

        String input = "Hello! {firstname} {lastname}";

        String output =
                properties.keySet().stream()
                          .reduce(input, (y, e) -> y.replaceAll("\\{" + e + "\\}", properties.get(e)));

        System.out.println(output);


    }
}
