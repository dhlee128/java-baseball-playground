package view;

import ball.Ball;

import java.util.List;
import java.util.Scanner;

public class InputView {

    public List<Integer> printInputNumber() {
        System.out.print("숫자를 입력해 주세요 : ");

        Ball ball = new Ball();

        return ball.makeUser();

    }

    public boolean printRestartGame() {
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if(num == 1) {
            return true;
        } else {
            return false;
        }
    }
}
