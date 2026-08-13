package ex01_multiarr;

public class Ex1_multiArr {
    public static void main(String[] args) {
        
    // 값은 가장 작은 index에만 저장이 가능하다.

    int[][] test = new int[2][3];test[0][0]=100;test[0][1]=200;test[0][2]=300;

    test[1][0]=400;test[1][1]=500;test[1][2]=600;

    // test[2][0] = 700; //오류(없는 index)

    // 출력
    for(
    int i = 0;i<test.length;i++)
    {
        for (int j = 0; j < test[i].length; j++) {

            System.out.print(test[i][j] + " ");

        } // inner
        System.out.println();

    }// outer

}// main

}// class
