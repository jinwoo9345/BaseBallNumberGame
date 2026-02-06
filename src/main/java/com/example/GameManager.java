package com.example;

import com.example.NumberGenerator.NumberGenerator;
import com.example.Result.Result;
import com.example.UI.InputUI;
import com.example.UI.OutputUI;
import com.example.validate.NumberMacher;

public class GameManager {

    private final NumberGenerator generator;
    private final NumberMacher numberMacher;
    private final InputUI inputUI;
    private final OutputUI outputUI;


    public GameManager(NumberGenerator generator) {
        this.generator = generator;
        this.numberMacher = new NumberMacher(); // 심판
        this.inputUI = new InputUI();           // 입력ui
        this.outputUI = new OutputUI();         // 출력ui
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
