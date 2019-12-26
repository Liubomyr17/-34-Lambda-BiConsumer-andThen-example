package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {

        BiConsumer<Integer, Integer> adder = (I1,I2)->
    System.out.println("Adder:"+(I1+I2));

        BiConsumer<Integer, Integer> multiplier = (I1,I2)->
    System.out.println("Integer:"+(I1*I2));

        adder.andThen(multiplier).accept(30, 50);
        System.out.println("--------------------------------");
        multiplier.andThen(adder).accept(10, 30);


    }
}
