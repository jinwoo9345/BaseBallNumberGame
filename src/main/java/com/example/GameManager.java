package com.example;

import com.example.NumberGenerator.NumberGenerator;
import com.example.Result.Result;
import com.example.UI.InputUI;
import com.example.UI.OutputUI;
import com.example.validate.NumberMacher;

public class GameManager {
    // 1. 필요한 부품들을 멤버 변수(필드)로 선언
    private final NumberGenerator generator;
    private final NumberMacher numberMacher;
    private final InputUI inputUI;
    private final OutputUI outputUI;

    // 2. 생성자: 외부에서 받을 건 받고, 내부에서 만들 건 만듦
    public GameManager(NumberGenerator generator) {
        this.generator = generator;
        this.numberMacher = new NumberMacher(); // 심판 고용
        this.inputUI = new InputUI();           // 입력기 장만
        this.outputUI = new OutputUI();         // 출력기 장만
    }
    public void play() {
        String answer = generator.generateNum();
        // 검증용 메시지
        System.out.println("정답은"+answer);


        //게임시작 메시지 출력
        outputUI.gameStart();


        while(true) {
            String input = inputUI.inputNumber();
            Result result = numberMacher.matchNumber(answer,input);

            outputUI.printResult(result);

            if(result.isGameClear()){
                outputUI.printGameClearMessage();
                break;
            }

        }

    }
}
