package com.example.UI;

import com.example.validate.InputValidator;

import java.util.Scanner;

public class InputUI {

    private final Scanner scanner;
    private final InputValidator validator;

    public InputUI() {
        this.scanner = new Scanner(System.in);
        this.validator = new InputValidator();

    }

    public String inputNumber() {
        while (true) {
            System.out.print("4자리의 서로다른 숫자를 입력하시오: ");
            String input = scanner.nextLine();

            // 검증기를 통해 검사
            if (validator.validate(input)) {
                return input;
            }

            System.out.println("유효한 숫자를 다시 입력해주세요!! ");
        }
    }
}