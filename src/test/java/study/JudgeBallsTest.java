package study;

import domain.Balls;
import domain.Result;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class JudgeBallsTest {

    static Balls balls;

    @BeforeAll
    static void setUp() {
        balls = new Balls(Arrays.asList(1, 2, 3));
    }

    @Test
    @DisplayName("스트라이크, 볼 수 확인")
    void judgeBallsTest() {

        List<Integer> randomBalls = Arrays.asList(7, 2, 1);

        Result res = balls.judgeBalls(randomBalls);

        assertThat(1).isEqualTo(res.getStrike());
        assertThat(1).isEqualTo(res.getBall());
    }

    @Test
    @DisplayName("낫싱 확인")
    void judgeBallsNothingTest() {

        List<Integer> randomBalls = Arrays.asList(9, 4, 5);

        Result res = balls.judgeBalls(randomBalls);

        assertThat(true).isEqualTo(res.isNothing());
    }

    @Test
    @DisplayName("3스트라이크 확인")
    void judgeBallsStrikeTest() {

        List<Integer> randomBalls = Arrays.asList(1, 2, 3);

        Result res = balls.judgeBalls(randomBalls);

        assertThat(true).isEqualTo(res.is3Strike());
    }

}
