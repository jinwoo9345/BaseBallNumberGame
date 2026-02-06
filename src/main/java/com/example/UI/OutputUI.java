package com.example.UI;

import com.example.Result.Result;

import java.util.List;

public class OutputUI {



    //게임시작 메시지 출력
    public void gameStart(){
        System.out.println("Game Started: 랜덤 숫자가 생성되었습니다.");
    }

    // 입력턴마다 메시지 출력
    public void printResult(Result result) {
        System.out.println("매칭 결과: "+ result.getResult());
    }

    // 게임 클리어시 메시지 출력
    public void printGameClearMessage() {
        System.out.println("4개의 숫자를 모두 맞히셨습니다! 게임 종료");
    }

    public void printHistory(List<String> history) {

        if(history.isEmpty()) {
            System.out.println("history가 없습니다!!");
            return;
        }
        System.out.println("===전체입력 기록===");
        for (String s : history) {
            System.out.println(s);
        }
        System.out.println("=================");
    }
}