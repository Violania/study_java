package ex3_break;

public class Ex2_break {
    public static void main(String[] args) {
        for (int i = 1; i <= 3; i++) {
            switch (i) {
                case 1:
                    System.out.println("case 1");
                    break;// switch문의 break는 반복문을 빠져나가지 못한다.(현재 switch문 만 빠져나가는 용도로 사용된다)

                case 2:
                    System.out.println("case 2");
                    break;

                case 3:
                    System.out.println("case 3");
                    break;

            }// switch

            System.out.println("i의 값 : " + i);

        } // for

    }// main

}// class
