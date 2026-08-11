package ex6_work;

public class Ex03_work {
    public static void main(String[] args) {

        /*
         * 주사위 2개를 던져 합이 5,6,7,이 되는 경우의 수를 찿아 출력
         * ---------------
         * 5 : 1 4 2 3 3 2 4 1
         * 6 : 1 5 2 4 4 2 5 1
         * 7 : 1 6 2 5 5 2 6 1
         */
        /*
         * 내코드
         * int dice1 = 0;
         * int dice2 = 0;
         * 
         * for(int i = 1; i <= 6; i++){
         * for(int j = 1; j <=6; j++){
         * switch (i + j) {
         * case 5:
         * System.out.printf("5 : %d %d  %d %d  %d %d  %d %d\n",i, j, i, j, i, j);
         * break;
         * case 6:
         * System.out.printf("5 : %d %d  %d %d  %d %d  %d %d\n");
         * break;
         * case 7:
         * System.out.printf("5 : %d %d  %d %d  %d %d  %d %d\n");
         * break;
         * 
         * 
         * default:
         * break;
         * }
         * }
         * }
         */

        String five = "";
        String six = "";
        String seven = "";

        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= 6; j++) {

                int res = i + j;
                switch (res) {
                    case 5:
                        five += i + " " + j + "  ";
                        break;
                    case 6:
                        six += i + " " + j + "  ";
                        break;
                    case 7:
                        seven += i + " " + j + "  ";
                        break;
                }

            }
        }

        System.out.println("5 : " + five);
        System.out.println("6 : " + six);
        System.out.println("7 : " + seven);

    }// main
}// class
