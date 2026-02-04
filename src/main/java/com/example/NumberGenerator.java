package com.example;

import java.util.LinkedHashSet;
import java.util.Random;
import java.util.stream.Collectors;

public class NumberGenerator {

    public  String generateNum() {
        LinkedHashSet<Integer> number = new LinkedHashSet<>();
        Random rand = new Random();

        while(number.size()!=4){
            number.add(rand.nextInt(10));
        }
        String answerNumber = number.stream().map(Object::toString).collect(Collectors.joining());

        return answerNumber;
    }
}
