package com.example;

import java.util.Scanner;

public class InputUI {


    public String inputNumber(){
        String input;
        InputValidator validator = new InputValidator();
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.print("4자리의 서로다른 숫자를 입력하시오: ");

            input = scanner.nextLine();

            if(validator.validate(input)){
                return input;
            }

            System.out.println("유효한 숫자를 다시 입력해주세요!! ");
        }
    }
}
