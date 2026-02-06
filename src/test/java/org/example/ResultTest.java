package org.example;

import com.example.Result;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

public class ResultTest {

    @DisplayName("스트라이크갯수가 4개이면 게임 승리")
    @Test
    void isGameClearTest(){
        Result result = new Result(4,0);
        assertThat(result.isGameClear()).isTrue();
    }
    @DisplayName("스트라이크 갯수가 3개 이하이면 승리 실패")
    @Test
    void isGameClearTest2(){
        Result result = new Result(3,0);
        assertThat(result.isGameClear()).isFalse();
    }

    @DisplayName("숫자 검증을 통한 메시지 결과 출력 테스트")
    @Test
    void resultMessageTest(){
        assertAll(
                () -> assertThat(new Result(0, 0).getResult()).isEqualTo("아웃"),
                () -> assertThat(new Result(0, 2).getResult()).isEqualTo("2볼"),
                () -> assertThat(new Result(2, 0).getResult()).isEqualTo("2스트라이크"),
                () -> assertThat(new Result(1, 1).getResult()).isEqualTo("1볼 1스트라이크")
        );
    }

}
