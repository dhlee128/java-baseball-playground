package study;

import Judge.JudgeBall;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class JudgeBallTest {

    JudgeBall judgeball = new JudgeBall();

    @Test
    @DisplayName("스트라이크 수 확인")
    void judgeStrikeTest() {

        List<Integer> list1 = Arrays.asList(1,2,3);
        List<Integer> list2 = Arrays.asList(7,2,3);

        assertThat(2).isEqualTo(judgeball.judgeStrike(list1, list2));
    }

    @Test
    @DisplayName("볼 수 확인")
    void judgeBallTest() {

        List<Integer> list1 = Arrays.asList(1,3,2);
        List<Integer> list2 = Arrays.asList(7,2,3);

        assertThat(2).isEqualTo(judgeball.judgeBall(list1, list2));
    }

}
