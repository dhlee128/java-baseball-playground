package view;

import domain.Balls;
import util.Constant;
import util.Validator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InputView {

    public Balls printInputNumber() {

        return new Balls(makePlayer());
    }

    public boolean printRestartGame() {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        return num == 1;
    }

    public List<Integer> makePlayer() {

        List<Integer> playerBalls = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        String inputNum = sc.next();

        Validator validator = new Validator();

        validator.chkInputSize(inputNum);

        for(int i = 0; i< Constant.NUMBER_LENGTH; i++) {
            int num = (int)inputNum.charAt(i)-'0';

            validator.chkInputNum(playerBalls, num);

            playerBalls.add(num);
        }

        return playerBalls;
    }

}
