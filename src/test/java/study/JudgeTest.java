package study;

import domain.Balls;
import domain.Result;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class JudgeTest {

    @Test
    @DisplayName("스트라이크 와 볼 수 확인")
    void judgeTest() {

        Balls playerBalls = new Balls(Arrays.asList(1,2,3));
        Balls randomBalls = new Balls(Arrays.asList(7,2,1));

        Result res = playerBalls.judge(randomBalls);

        assertThat(1).isEqualTo(res.getStrike());
        assertThat(1).isEqualTo(res.getBall());
    }

    @Test
    @DisplayName("스트라이크 수 확인")
    void judgeStrikeTest() {

        Balls playerBalls = new Balls(Arrays.asList(7,2,3));
        Balls randomBalls = new Balls(Arrays.asList(7,2,1));

        assertThat(2).isEqualTo(playerBalls.judgeStrike(randomBalls));
    }

    @Test
    @DisplayName("볼 수 확인")
    void judgeBallTest() {

        Balls playerBalls = new Balls(Arrays.asList(7,2,3));
        Balls randomBalls = new Balls(Arrays.asList(3,2,7));

        assertThat(2).isEqualTo(playerBalls.judgeBall(randomBalls));
    }

}
