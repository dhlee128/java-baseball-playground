package ball;

import util.Constant;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Ball {

    public List<Integer> makeUser() {
        List<Integer> list = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        String num = sc.next();

        for(int i = 0; i< Constant.NUMBER_LENGTH; i++) {
            list.add((int)num.charAt(i)-'0');
        }

        return list;
    }

    public List<Integer> makeRandom() {
        List<Integer> list = new ArrayList<>();
        Random random = new Random();

        while (list.size()!=Constant.NUMBER_LENGTH) {
            int num = random.nextInt(9)+1;

            if(!list.contains(num)) {
                list.add(num);
            }
        }

        return list;
    }

}
