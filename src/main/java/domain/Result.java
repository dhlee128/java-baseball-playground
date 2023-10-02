package domain;

import util.Constant;

public class Result {
    private int strike=0;
    private int ball=0;

    public Result(int strike, int ball) {
        this.strike = strike;
        this.ball = ball;
    }

    public int getStrike() {
        return strike;
    }

    public int getBall() {
        return ball;
    }

    public boolean is3Strike() {
        return strike == Constant.NUMBER_LENGTH;
    }

    public boolean isNothing() {
        return strike==0 && ball==0;
    }
}
