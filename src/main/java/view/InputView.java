package view;

import domain.Balls;
import util.Constant;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InputView {

    public Balls printInputNumber() {
        System.out.print("숫자를 입력해 주세요 : ");

        return new Balls(makePlayer());
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

    public List<Integer> makePlayer() {

        List<Integer> playerBalls = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        String inputNum = sc.next();

        if(inputNum.length() != Constant.NUMBER_LENGTH) {
            throw new IllegalArgumentException(Constant.NUMBER_LENGTH+"자리를 입력해주세요.");
        }

        for(int i = 0; i< Constant.NUMBER_LENGTH; i++) {
            int num = (int)inputNum.charAt(i)-'0';
            if(num<1 || num>9) throw new IllegalArgumentException("0-9 를 입력해주세요.");

            playerBalls.add(num);
        }

        return playerBalls;
    }
}
