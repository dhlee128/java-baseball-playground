package study;

import game.BaseballGame;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import util.Constant;
import util.Validator;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class GenerateBallTest {

    static List<Integer> randomBalls;
    static Validator validator;

    @BeforeAll
    static void setUp() {
        BaseballGame game = new BaseballGame();
        randomBalls = game.makeRandom();

        validator = new Validator();
    }

    @Test
    @DisplayName("랜덤 Ball 사이즈 확인")
    void randomBallSizeTest() {

        assertThat(Constant.NUMBER_LENGTH).isEqualTo(randomBalls.size());
    }

    @Test
    @DisplayName("랜덤 Ball 중복 확인")
    void randomBallDuplicateTest() {

        assertThat(Constant.NUMBER_LENGTH).isEqualTo(randomBalls.stream().distinct().count());
    }

    @Test
    @DisplayName("플레이어 Ball 사이즈 확인")
    void playerBallSizeTest() {

        Throwable exception = assertThrows(RuntimeException.class, () -> {
            validator.chkInputSize("1");
        });
        assertEquals(Constant.INPUT_NUMBER_LENGTH_EXP, exception.getMessage());
    }

    @Test
    @DisplayName("플레이어 Ball 중복 확인")
    void playerBallDuplicateTest() {

        Throwable exception = assertThrows(RuntimeException.class, () -> {
            validator.chkInputNum(Arrays.asList(1,3), 3);
        });
        assertEquals(Constant.INPUT_NUMBER_DUPLICATE_EXP, exception.getMessage());
    }

    @Test
    @DisplayName("플레이어 Ball 숫자 확인")
    void playerBallNumTest() {

        Throwable exception = assertThrows(RuntimeException.class, () -> {
            validator.chkInputNum(Arrays.asList(1,3), 0);
        });
        assertEquals(Constant.INPUT_NUMBER_LIMIT_EXP, exception.getMessage());
    }

}
