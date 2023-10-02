package domain;

import util.Constant;
import util.BallStatus;

import java.util.ArrayList;
import java.util.List;

public class Balls {

    private final List<Ball> balls = new ArrayList<>();

    public Balls(List<Integer> balls) {

        for(int i=0; i<Constant.NUMBER_LENGTH; i++) {
            this.balls.add(new Ball(balls.get(i), i));
        }
    }

    public Result judgeBalls(List<Integer> balls) {

        Balls randomBalls = new Balls(balls);
        Result result = new Result();

        for(Ball ball : this.balls) {
            BallStatus status = randomBalls.judgeBalls(ball);
            result.calc(status);
        }

        return result;
    }

    public BallStatus judgeBalls(Ball plyerBall) {

        return this.balls.stream()
                .map(randomBall -> randomBall.judgeBall(plyerBall))
                .filter(ballStatus -> !BallStatus.NOTHING.equals(ballStatus))
                .findFirst()
                .orElse(BallStatus.NOTHING);
    }

}
