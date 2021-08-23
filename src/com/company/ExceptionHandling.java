package com.company;

import java.util.function.BiConsumer;

public class ExceptionHandling {
    public static void main(String[] args) {
        int [] someArr = {1,2,3,4,5};
        int key = 0;

        process(someArr,key,wrapperLambda((v,k) -> System.out.println(v/k)));
    }
    private static void process(int[] someArr, int key, BiConsumer<Integer,Integer> consumer){
        for (int i:someArr) {
            consumer.accept(i,key);
        }
    }

    private static BiConsumer<Integer,Integer> wrapperLambda(BiConsumer<Integer,Integer> consumer){
        return (v,k) -> {
            try {
                consumer.accept(v,k);
            }
            catch (ArithmeticException e) {
                System.out.println("Exception Occurred");
            }
        };
    }
}
