package ex07_work;

import java.util.Random;

public class Graph {
    public static void main(String[] args) {
        // 0~9사이의 난수를 100개 발생시키고
        // 각 숫자가 몇개씩 만들어졌는지를 그래프화 하시오
        // ------------------------------------------
        // 0의 갯수 : ############ 12
        // 1의 갯수 : ####### 7
        // ....
        // 9의 갯수 : ########## 10

        int[] numbers = new int[100];
        int[] cnt = new int[10];
        // 숫자 갯수
        for (int i = 0; i < 10; i++) {
            cnt[i] = 0;
        }
        // 난수
        for (int i = 0; i < 100; i++) {
            numbers[i] = new Random().nextInt(10) + 1;
            // 숫자 갯수 세기(인데 안되는중) 0-9까지 각자 변수초기화해서 하는건 너무 긺-- //for문으로 자동화시도중(0으로만 나오는중-값은 나오는데 갯수 합이 100개가 아님)
            // for (int j = 0; j < 10; j++) {
            // if(cnt[j] == numbers[i]){
            // cnt[i]++;
            // }
            // if(numbers[i] == cnt[i]){
            // cnt[i]++;
            // }
            cnt[numbers[i]]++;//일단 난수값에 맟춘 자동 카운트 증가 해결-값은 나오는데 갯수 합이 100개가 아님 (실행떄마다 값이 달라짐?????)
        }
        for (int j = 0; j < 10; j++) {
            System.out.println(cnt[j]);
            
        }
        // // 그래프 그리기(cnt 카운팅에서 막혀서 아직 확인 불가)- 일단 서브에서 해보자
        // for (int i = 0; i < cnt.length; i++) {
        //     for (int j = 0; j < cnt[i]; j++) {
        //         System.out.print("#");

        //     }
        //     System.out.println();
        // }

    }// main
}
