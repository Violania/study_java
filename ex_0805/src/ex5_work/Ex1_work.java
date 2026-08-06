package ex5_work;

public class Ex1_work {
    public static void main(String[] args) {
        /* 과수원이 있다
        배,사과,오렌지를 키우고 있는데 ,하루에 생산되는 양이 
        각각 5, 7, 5개.
        
        1.과수원에서 하루에 생산되는 과일의 총 갯수를 출력
        2.시간당 전체 과일의 평균 생신 갯수
        단, 과일의 갯수을 담는 변수는 int, 평균을 계산할 변수는 float
        */
       //1
       int pear = 5; //배
       int apple = 7; //사과
       int orange = 5; //오렌지
       int total = pear + apple + orange;
       float avg = total / 24f;
       System.out.println("하루생산량 : " + total);
       System.out.println("시간당 평균 :" + avg);
       
        //2
       int p1 = 5;
       int a1 = 7;
       int o1 = 5;
       float avg1 = (p1 + a1 + o1)/24f;
       float total1 = avg1 * 24f;
       int total2 = (int)total1;
       System.out.println( "하루생산량 : " + total2);
       System.out.println("시간당 평균 : " + avg1);

       

    
    }
    
}
