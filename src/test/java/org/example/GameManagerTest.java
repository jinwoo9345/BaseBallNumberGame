package org.example;

import com.example.GameManager;
import com.example.NumberGenerator.FakeGenerator;
import com.example.NumberGenerator.NumberGenerator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;

public class GameManagerTest {

    @DisplayName("올바른 숫자를 입력했을때 게임 클리어로 진행되어야 한다")
    @Test
    public void test() {
        //1.게임에 필요한 정답 생성기 객체 생성
        NumberGenerator generator = new FakeGenerator();
        // 2. 키보드를 통한 숫자 입력 (직접 불가능 테스트로 생성)
        String input = "1234";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        // 3. 게임 매니저 객체 생성후 정답 생성기 전달
        GameManager gameManager = new GameManager(generator);

        gameManager.play();

    }

}
