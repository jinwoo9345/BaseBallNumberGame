package com.example;

public class NumberMacher {


    public Result matchNumber(String answer, String input) {
        int strike = 0;
        int ball = 0;

        for (int i = 0; i < answer.length(); i++) {
            // 1. 스트라이크 처리
            if (answer.charAt(i) == input.charAt(i)) {
                strike++;
                continue;
            }

            // 2. 볼 처리
            if (answer.contains(String.valueOf(input.charAt(i)))) {
                ball++;
            }
        }

        return new Result(strike, ball);
    }
}
