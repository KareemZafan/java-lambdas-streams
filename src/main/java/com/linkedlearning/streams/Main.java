package com.linkedlearning.streams;

import java.util.function.Function;
import java.util.function.IntBinaryOperator;

public class Main {

    public static void main(String[] args) {
        Greeting greeting = new HelloGreeting();
        greeting.sayHello();

        Greeting gr2 = () -> System.out.println("Hello World 2");
        gr2.sayHello();

        IntBinaryOperator calc = (x, y) -> {
            return (x * x) + (y * y);
        };
        System.out.println(calc.applyAsInt(1, 2));

        Function<Integer, Double> half = a -> a / 2.0;
        half = half.andThen(a -> 4 * a); // Multiply by 4
        System.out.println(half.apply(13));

        // there are a lot of predefined functional interface in Java see java documentation
    }
}
