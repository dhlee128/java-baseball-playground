package domain;

import util.Constant;
import java.util.List;

public class Balls {

    private List<Integer> balls;

    public Balls(List<Integer> balls) {
        this.balls = balls;
    }

    public Result judge(Balls randomBall) {

        int ballCnt = this.judgeBall(randomBall);
        int strikeCnt = this.judgeStrike(randomBall);

        return new Result(strikeCnt, ballCnt);
    }

    public int judgeStrike(Balls randomBall) {

        int strikeCnt = 0;

        for(int i = 0; i< Constant.NUMBER_LENGTH; i++) {
            if(balls.get(i) == randomBall.balls.get(i)) {
                strikeCnt++;
            }
        }
        return strikeCnt;
    }

    public int judgeBall(Balls randomBall) {

        int ballCnt = 0;
        List<Integer> randomBalls = randomBall.balls;

        for(int i=0; i<Constant.NUMBER_LENGTH; i++) {
            int num = balls.get(i);

            if(randomBalls.contains(num) && randomBalls.get(i)!=num) {
                ballCnt++;
            }
        }
        return ballCnt;
    }

}
