package ex9_work;

import java.util.Random;

public class WorkSub {

    public void lottomake(int[] lotto) {

        Random rnd = new Random();
        outer: for (int i = 0; i < lotto.length;) {
            lotto[i] = rnd.nextInt(45) + 1;

            for (int j = 0; j < i; j++) {
                
                if (lotto[i] == lotto[j]) {
                    continue outer;
                } 
            }
            i++;
        }

    }
}
