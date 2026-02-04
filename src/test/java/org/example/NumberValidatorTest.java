package org.example;

import com.example.NumberValidator;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class NumberValidatorTest {

    @Test
    void 생성된_숫자가_4자리이면_성공(){
        NumberValidator numValidator = new NumberValidator();

        boolean result = numValidator.validate("1234");

        assertThat(result).isTrue();
    }

    @Test
    void 생성된_숫자가_4자리가_아니면_실패(){

        NumberValidator numValidator = new NumberValidator();

        boolean result = numValidator.validate("12345");

        assertThat(result).isFalse();
    }

    @Test
    void 생성된_숫자는_4자리전부_다른_숫자이면_성공(){
        NumberValidator numValidator = new NumberValidator();
        boolean result = numValidator.validate("1234");
        assertThat(result).isTrue();
    }

    @Test
    void 생성된_숫자가_4자리중_하나라도_중복된다면_실패(){
        NumberValidator numValidator = new NumberValidator();
        boolean result = numValidator.validate("1224");
        assertThat(result).isFalse();
    }
}



