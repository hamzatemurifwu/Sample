package com.company;

import java.util.Arrays;
import java.util.List;

public class CollectionIterationExample {
    public static void main(String[] args) {
        List<Persons> people = Arrays.asList(
                new Persons("Charles", "Dickens", 60),
                new Persons("Lewis", "Carrol", 42),
                new Persons("Thomas", "Carlyle", 51),
                new Persons("Charlotte", "Bronte", 45),
                new Persons("Matthew", "Arnold", 38)
        );

        people.forEach(System.out::println);
    }
}
