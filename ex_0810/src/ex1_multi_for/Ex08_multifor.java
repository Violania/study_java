package ex1_multi_for;

public class Ex08_multifor {
    public static void main(String[] args) {

        /*
         * 1 2 3 4 5 6 7 8 9 10
         * 2 3 4 5 6 7 8 9 10 1
         * 3 4 5 6 7 8 9 10 1 2
         * ......
         * 10 1 2 3 4 5 6 7 8 9
         */

        for (int i = 1; i <= 10; i++) {// 10줄
            for (int j = 0; j <= 9; j++) { // 10칸 j < 10도 가능
                int num = i + j;
                if (num > 10) {// if문이 단 한줄인 경우 중괄호 생략 가능 (if 바로 아래 한줄은 if),for ,while도 마찬가지
                    num = num - 10; // num -= 10
                } // inner
                System.out.print(num + " ");

            } // inner
            System.out.println();
        }

    }// main

}// class
