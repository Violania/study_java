package ex4_continue;

public class Ex01_continue {
    public static void main(String[] args) {
        /*
         * 반복문 내에서 특정 코드를 건너뛰고자 할 때
         */

        for (int i = 1; i <= 2; i++) {

            for (int j = 1; j <= 5; j++) {

                if (j % 2 == 0) {

                    /*
                     * for문 안에서 continue를 만나면 가까운 for문의 증감식으로 넘어간다
                     * for문에 증감식이 없다면 조건식으로 간다
                     */
                    continue;
                    // 이곳의 코드는 에러
                }
                System.out.print(j + " ");

            }
            System.out.println();
        }

    }// main
}// class
