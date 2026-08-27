package ex1_set;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Ex02_Set {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<Integer>();
        Random rnd = new Random();

        while (ts.size() < 6) {
            
            int r = rnd.nextInt(45) + 1;
            ts.add(r);
        }

        System.out.println(ts);

        System.out.println(ts.subSet(10,30));

        System.out.println("---------------");

        Set<String> set = new TreeSet<String>();
        set.add("홍길동");
        set.add("강길순");
        set.add("고길동");
        System.out.println(set);
    }
}
