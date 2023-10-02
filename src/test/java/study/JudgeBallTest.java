package study;

import domain.Ball;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import util.BallStatus;

import static org.assertj.core.api.Assertions.assertThat;

public class JudgeBallTest {

    static Ball ball;

    @BeforeAll
    static void setUp() {
        ball = new Ball(7, 0);
    }

    @Test
    @DisplayName("스트라이크 확인")
    void strikeJudgeTest() {
        assertThat(BallStatus.STRIKE).isEqualTo(ball.judgeBall(new Ball(7, 0)));
    }

    @Test
    @DisplayName("볼 확인")
    void strikeBallTest() {
        assertThat(BallStatus.BALL).isEqualTo(ball.judgeBall(new Ball(7, 1)));
    }

    @Test
    @DisplayName("낫싱 확인")
    void strikeNothingTest() {
        assertThat(BallStatus.NOTHING).isEqualTo(ball.judgeBall(new Ball(9, 2)));
    }


}
