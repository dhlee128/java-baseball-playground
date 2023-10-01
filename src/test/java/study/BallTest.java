package study;

import ball.Ball;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import util.Constant;

import java.util.Collections;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class BallTest {

    Ball ball = new Ball();

    @Test
    @DisplayName("랜덤 숫자 생성")
    void makeRandomTest() {

        List<Integer> list = ball.makeRandom();

        assertThat(Constant.NUMBER_LENGTH).isEqualTo(list.size());

        for(int num : list) {
            assertThat(true).isEqualTo(num>=1 && num<=9);
            assertThat(1).isEqualTo(Collections.frequency(list, num));
        }
    }

    @Test
    @DisplayName("사용자 숫자 생성")
    void makeUserTest() {

        List<Integer> list = ball.makeUser();

        assertThat(Constant.NUMBER_LENGTH).isEqualTo(list.size());

        for(int num : list) {
            assertThat(true).isEqualTo(num>=1 && num<=9);
            assertThat(1).isEqualTo(Collections.frequency(list, num));
        }
    }
}
