package view;

import util.Constant;

public class ResultView {
    public void printResult(int ball, int strike) {
        if(ball>0 && strike>0) {
            System.out.println(ball+"볼 "+strike+"스트라이크");
            return;
        }
        if(ball>0) {
            System.out.println(ball+"볼");
            return;
        }
        if(strike>0) {
            System.out.println(strike+"스트라이크");
            return;
        }

        System.out.println("낫싱");
    }

    public void printGameOver() {
        System.out.println(Constant.NUMBER_LENGTH+"개의 숫자를 모두 맞히셨습니다! 게임 종료");
    }
}
