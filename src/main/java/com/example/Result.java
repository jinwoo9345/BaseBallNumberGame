package com.example;

public class Result {

    private int strike;
    private int ball;

    public Result(int strike, int ball) {
        this.strike = strike;
        this.ball = ball;
    }

    public boolean isGameClear() {
        if(strike == 4){
            return true;
        }
        return false;
    }

    public String getResult(){

        if(strike ==0 && ball == 0){
            return ResultEnum.OUT.getMessage();
        }

        StringBuilder sb = new StringBuilder();

        // 2. 볼 처리
        if (ball > 0) {
            sb.append(ball).append(ResultEnum.BALL.getMessage()); // "볼"
        }

        // 3. 공백 처리 (볼과 스트라이크가 둘 다 있을 때만 공백 추가)
        if (ball > 0 && strike > 0) {
            sb.append(" ");
        }

        // 4. 스트라이크 처리
        if (strike > 0) {
            sb.append(strike).append(ResultEnum.STRIKE.getMessage()); // "스트라이크"
        }

        return sb.toString();

    }
}
