package org.example;

import com.example.NumberGenerator;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class NumberGeneratorTest {
    @Test
    void  생성한_숫자는_4자리_숫자면_성공(){
        NumberGenerator generator = new NumberGenerator();

        boolean result = generator.generateNum().length()==4;

        assertThat(result).isTrue();
    }

    @Test
    void 생성한_숫자가_4자리가_아니면_실패(){
        NumberGenerator generator = new NumberGenerator();

        boolean result = generator.generateNum().length()!=4;

        assertThat(result).isFalse();
    }

    @Test
    void 생성한_숫자가_하나라도_중복되면_실패(){
        Set<Character> set = new HashSet<>();

        NumberGenerator generator = new NumberGenerator();

        for(int i=0; i<4; i++) {
            set.add(generator.generateNum().charAt(i));
        }

        boolean result = set.size() != 4;

        assertThat(result).isFalse();

    }

    @Test
    void 생성한_숫자가_전부_다르면_성공(){
        Set<Character> set = new HashSet<>();

        NumberGenerator generator = new NumberGenerator();

        for(int i=0; i<4; i++) {
            set.add(generator.generateNum().charAt(i));
        }

        boolean result = set.size() == 4;

        assertThat(result).isTrue();

    }
}
