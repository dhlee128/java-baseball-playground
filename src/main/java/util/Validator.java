package util;

import java.util.List;

public class Validator {

    public void chkInputSize(String str) {
        if(str.length() != Constant.NUMBER_LENGTH) {
            throw new IllegalArgumentException(Constant.INPUT_NUMBER_LENGTH_EXP);
        }
    }

    public static void chkInputNum(List<Integer> playerBalls, int num) {

        if(num<1 || num>9) throw new IllegalArgumentException(Constant.INPUT_NUMBER_LIMIT_EXP);

        if(playerBalls.contains(num)) throw new IllegalArgumentException(Constant.INPUT_NUMBER_DUPLICATE_EXP);
    }
}
