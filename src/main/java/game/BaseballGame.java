package game;

import domain.Balls;
import domain.Result;
import util.Constant;
import view.InputView;
import view.OutputView;

import java.util.*;
import java.util.stream.Collectors;

public class BaseballGame {

    public void exec() {

        InputView inView = new InputView();
        OutputView outView = new OutputView();

        do {

            baseBallJudge(inView, outView, makeRandom());
            outView.printRestartGame();

        } while(inView.printRestartGame());
    }

    private void baseBallJudge(InputView inView, OutputView resView, List<Integer> randomBalls) {

        resView.printInputNumber();
        Balls playerBalls = inView.printInputNumber();

        Result result = playerBalls.judgeBalls(randomBalls);

        if(result.is3Strike()) resView.printGameOver();

        if(!result.is3Strike()) {
            resView.printResult(result);
            baseBallJudge(inView, resView, randomBalls);
        }
    }

    public List<Integer> makeRandom() {

        Set<Integer> randomBalls = new HashSet<>();
        Random random = new Random();

        while (randomBalls.size()!=Constant.NUMBER_LENGTH) {
            int num = random.nextInt(9)+1;
            randomBalls.add(num);
        }

        return randomBalls.stream().collect(Collectors.toList());
    }

}
