package com.example.validate;

import java.util.HashSet;
import java.util.Set;

public class InputValidator {

    public boolean validate(String number) {
        Set<Character> set = new HashSet<Character>();
        // 먼저 네자리인지, 네자리 모두 숫자인지
        if (number.length() != 4 || !number.matches("[0-9]+")) {
            return false;
        }
        // 이후 Set에 저장하여 중복된 문자 제거
        for (int i = 0; i < 4; i++) {
            set.add(number.charAt(i));
        }

        // 4개 보다 줄었을시 중복된 문자 존재
        if (set.size() != 4) {
            return false;
        }

        return true;
    }
}
