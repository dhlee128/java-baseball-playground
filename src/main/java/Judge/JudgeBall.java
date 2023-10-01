package Judge;

import util.Constant;

import java.util.List;

public class JudgeBall {

    public int judgeStrike(List<Integer> playerBall, List<Integer> randomBall) {

        int strike = 0;

        for(int i = 0; i< Constant.NUMBER_LENGTH; i++) {
            if(playerBall.get(i) == randomBall.get(i)) {
                strike++;
            }
        }
        return strike;
    }

    public int judgeBall(List<Integer> playerBall, List<Integer> randomBall) {

        int ball = 0;

        for(int i=0; i<Constant.NUMBER_LENGTH; i++) {
            int num = playerBall.get(i);

            if(randomBall.contains(num) && randomBall.get(i)!=num) {
                ball++;
            }
        }
        return ball;
    }
}
