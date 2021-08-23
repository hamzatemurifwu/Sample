package com.company;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;

//@FunctionalInterface
//interface Condition{
//    Boolean test(Persons p);
//}
public class Main {
    public static void main(String[] args) {
        List<Persons> people = Arrays.asList(
                new Persons("Charles", "Dickens", 60),
                new Persons("Lewis", "Carrol", 42),
                new Persons("Thomas", "Carlyle", 51),
                new Persons("Charlotte", "Bronte", 45),
                new Persons("Matthew", "Arnold", 38)
        );

        System.out.println("sorting");
//        Collections.sort(people, (p1,p2) -> p1.getLastName().compareTo(p2.getLastName()));
//                new Comparator<Persons>() {
//            @Override
//            public int compare(Persons o1, Persons o2) {
//                return o1.getLastName().compareTo(o2.getLastName());
//            }
//        });
        printConditionally(people, p -> true, System.out::println);
//        printConditionally(people, p -> true, p -> System.out.println(p));

        System.out.println("condition");
        printConditionally(people, p -> p.getLastName().startsWith("C"), p -> System.out.println(p.getAge()));
//                new Condition() {
//            @Override
//            public Boolean test(Persons p) {
//                return p.getLastName().startsWith("C");
//            }
//        });
    }

    private static void printConditionally(List<Persons> people, Predicate<Persons> predicate, Consumer<Persons> consumer) {
        for (Persons p :people) {
            if (predicate.test(p))
                consumer.accept(p);
                //System.out.println(p);
        }
    }
//    private static void printAll(List<Persons> people) {
//        for (Persons p :people) {
//            System.out.println(p);
//        }
//    }
}
