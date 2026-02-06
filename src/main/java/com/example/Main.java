package com.example;

import com.example.NumberGenerator.FakeGenerator;
import com.example.NumberGenerator.NumberGenerator;

public class Main {
    public static void main(String[] args) {

        NumberGenerator generator = new FakeGenerator();
        GameManager gameManager = new GameManager(generator);
        gameManager.play();
    }
}