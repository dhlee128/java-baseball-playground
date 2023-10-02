package domain;

import util.BallStatus;

public class Ball {

    private int num;
    private int pos;

    public Ball(int num, int pos) {
        this.num = num;
        this.pos = pos;
    }

    public BallStatus judgeBall(Ball ball) {
        if(this.num == ball.num && this.pos == ball.pos) return BallStatus.STRIKE;
        if(this.num == ball.num) return BallStatus.BALL;
        return BallStatus.NOTHING;
    }

}
