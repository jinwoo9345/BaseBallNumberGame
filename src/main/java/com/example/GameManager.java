package com.example;

import com.example.NumberGenerator.NumberGenerator;
import com.example.Result.Result;
import com.example.UI.InputUI;
import com.example.UI.OutputUI;
import com.example.validate.NumberMacher;

import java.util.ArrayList;
import java.util.List;

public class GameManager {
    private static final String HISTORY_COMMAND = "3";
    private final NumberGenerator generator;
    private final NumberMacher numberMacher;
    private final InputUI inputUI;
    private final OutputUI outputUI;
    private final List<String> history;


    public GameManager(NumberGenerator generator) {
        this.generator = generator;
        this.numberMacher = new NumberMacher(); // 심판
        this.inputUI = new InputUI();           // 입력ui
        this.outputUI = new OutputUI();         // 출력ui
        this.history = new ArrayList<String>();
    }
    public void play() {
        String answer = generator.generateNum();


        //게임시작 메시지 출력
        outputUI.gameStart();
        // 검증용 메시지
        System.out.println("검증용 메시지: 정답은"+answer);



        while(true) {
            String input = inputUI.inputNumber();

            if(input.equals(HISTORY_COMMAND)) {
                outputUI.printHistory(history);
                continue;
            }

            Result result = numberMacher.matchNumber(answer,input);

            // 결과를 history에 저장
            String log = "시도: " + input+ "-->" + "결과: " + result.getResult();
            history.add(log);

            outputUI.printResult(result);

            if(result.isGameClear()){
                outputUI.printGameClearMessage();
                break;
            }

        }

    }
}
