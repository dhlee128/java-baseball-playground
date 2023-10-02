package domain;

import util.BallStatus;
import util.Constant;

public class Result {
    private int strike;
    private int ball;

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

    public void calc(BallStatus status) {
        if(status.isStrike()) strike++;
        if(status.isBall()) ball++;
    }
}
