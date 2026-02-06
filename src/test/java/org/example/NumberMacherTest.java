package org.example;

import com.example.NumberMacher;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class NumberMacherTest {

    @DisplayName("숫자가 모두 같으면 4스트라이크가 나와야한다")
    @Test
    void numberMacherTest(){

        NumberMacher numberMacher = new NumberMacher();
        assertThat(numberMacher.matchNumber("1234","1234").getResult()).isEqualTo("4스트라이크");
    }

    @DisplayName("숫자가 모두 틀리면 아웃이 나와야한다")
    @Test
    void numberMacherTest2(){

        NumberMacher numberMacher = new NumberMacher();
        assertThat(numberMacher.matchNumber("1234","5678").getResult()).isEqualTo("아웃");
    }

    @DisplayName("하나는 완전히 일치하고 하나는 존재하지만 위치가 다르면 1ball 1strike가 나와야한다")
    @Test
    void numberMacherTest3(){

        NumberMacher numberMacher = new NumberMacher();
        assertThat(numberMacher.matchNumber("1234","1398").getResult()).isEqualTo("1볼 1스트라이크");
    }


}
