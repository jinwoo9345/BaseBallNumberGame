package com.example.UI;

import com.example.Result.Result;

public class OutputUI {

    // 입력턴마다 메시지 출력
    public void printResult(Result result) {
        System.out.println(result.getResult());
    }

    // 게임 클리어시 메시지 출력
    public void printGameClearMessage() {
        System.out.println("4개의 숫자를 모두 맞히셨습니다! 게임 종료");
    }
}