package org.example;

import com.example.NumberGenerator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;

import java.util.HashSet;
import java.util.Set;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class NumberGeneratorTest {
    @DisplayName("생성된 숫자는 4자리여야 한다.")
    @RepeatedTest(100)
    void lengthCheck() {
        NumberGenerator generator = new NumberGenerator();

        String result = generator.generateNum();

        assertThat(result.length()).isEqualTo(4);
    }

    @DisplayName("생성된 숫자는 중복되지 않아야 한다.")
    @RepeatedTest(100)
    void duplicationCheck() {
        NumberGenerator generator = new NumberGenerator();
        String result = generator.generateNum();

        Set<Character> uniqueChars = new HashSet<>();
        for (char c : result.toCharArray()) {
            uniqueChars.add(c);
        }


        assertThat(uniqueChars.size()).isEqualTo(4);
    }

}
