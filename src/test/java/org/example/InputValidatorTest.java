package org.example;

import com.example.validate.InputValidator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


public class InputValidatorTest {

    @DisplayName("입력된 문자는 숫자이다")
    @Test
    void testIsNumber(){
        InputValidator input = new InputValidator();

        boolean result = input.validate("abcd");

        assertThat(result).isFalse();
    }


    @DisplayName("입력된 숫자는 4자리여야한다")
    @Test
    void testInputValidator() {
        InputValidator input = new InputValidator();

        boolean result = input.validate("1234");

        assertThat(result).isTrue();

    }

    @DisplayName("입력된 숫자는 서로다른 4자리 숫자가 아니면 실패")
    @Test
    void testInputValidator2() {
        InputValidator input = new InputValidator();

        boolean result = input.validate("1224");

        assertThat(result).isFalse();

    }


    @DisplayName("입력된 숫자는 서로다른 4자리 숫자면 성공")
    @Test
    void testInputValidator3() {
        InputValidator input = new InputValidator();

        boolean result = input.validate("1234");

        assertThat(result).isTrue();

    }


}
