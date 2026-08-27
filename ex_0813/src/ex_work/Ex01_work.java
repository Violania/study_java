package ex_work;

public class Ex01_work {
    public static void main(String[] args) {

        int[][] arr = { { 7, 8, 11, 6 },
                        { 20, 13, 9, 2, 5 },
                        { 7, 7, 10 },
                        { 2, 3, 4, 5 } };

        // 배열arr에 답긴 모든 값의 합과 평균 구하기
        // --------------------
        // 총합 : 119
        // 평균 : 7.44

        //1 내 코드
        int total = 0;
        int count = 0;
        float avg = 0;

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {
                total += arr[i][j];
                count++;
            } // inner
        } // outer
        avg = (float) total / count;
        System.out.println("//1");
        System.out.printf("총합 : %d\n", total);
        System.out.printf("평균 : %.2f\n", avg);

        System.out.println("---------------------------");
        System.out.println("//2");

        // 2 선생님 코드
        int total1 = 0;
        float avg1 = 0;
        int cnt = 0;

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {
                total1 += arr[i][j];
                cnt++;
            } // inner
        } // outer
        avg1 = (float) total1 / cnt;

        System.out.printf("총합 : %d\n", total1);
        System.out.printf("평균 : %.2f", avg1);

    }// main
}// class
