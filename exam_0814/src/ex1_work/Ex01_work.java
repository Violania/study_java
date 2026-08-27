package ex1_work;

public class Ex01_work {
    public static void main(String[] args) {

        // 과수원이 있다
        // 배, 사과 , 오렌지를 키우고 있는데 하루에 생산되는 양이
        // 각각 5, 7, 5개

        // 1.과수원에서 하루에 생산되는 과일의 총 갯수를 출력
        // 2.시간당 전체 과일의 평균 생산 갯수
        // 단, 과일의 갯수를 담는 변수는 int, 평균을 계산할 변수는 float

        int[] fru = { 5, 7, 5 };
        String[] info = { "배", "사과", "오렌지" };

        int total = 0;
        float avg = 0;

        for (int i = 0; i < fru.length; i++) {
            for (int j = 0; j < fru.length; j++) {               
                System.out.printf("%s : %d %s : %d %s %d\n ",info[i], fru[i],info[i], fru[i], info[i], fru[i]);
                break;
            }
            total = fru[i] + total;
        }
        avg = total / 24f;

        System.out.printf(" 하루 총합 : %d\n", total);
        System.out.printf("시간당 평균 : %.2f", avg);


        // int pear = 5;
        // int apple = 7;
        // int orange = 5;

        // int total1 = pear + apple + orange;
        // float avg2 = total / 24f;

        // System.out.printf(" 하루 총합 : %d\n", total1);
        // System.out.printf("시간당 평균 : %.2f", avg2);
    } // main
}// class
