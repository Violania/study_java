package ex6_work;

public class Gradesub {

    public int userpoint(int cash, String usergrade) {

        if (usergrade.equalsIgnoreCase("vip")) {
            return cash * 10 / 100;
        } else if (usergrade.equalsIgnoreCase("gold")) {
            return cash * 5 / 100;
        } else if (usergrade.equalsIgnoreCase("silver")) {
            return cash * 3 / 100;
        } else {
            System.out.println("회원등급이 올바르지 않습니다");
            return 0;
        }

    }

}
