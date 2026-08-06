package ex_work;

public class Ex2_work {
    public static void main(String[] args) {
        /*
        [응용 연습문제]

        1. 나이가 20세 이상이고 키가 160cm 이상이면 "VIP 탑승가능"을 출력하고,
           그렇지 않으면 "일반탑승 또는 탑승불가"를 출력하세요.

        2. 나이가 10세 미만이거나 키가 130cm 미만이면 "탑승불가"를 출력하고,
           그렇지 않으면 "탑승가능"을 출력하세요.

        (정답은 따로 요청하세요)
        */

//1
        int age = 20;
        int height = 150;
        String str = "";
         if (age >= 20 && height >= 160) {
            str = "VIP 탑승가능";
         }else{
            str = "일반탑승 또는 탑승불가";
         }
         System.out.println(str);

//2         
         int age1 = 10;
         int height1 = 129;
         String str1 = "";
         if ( age1 < 10 || height1 < 130) {
            str1 ="탑승불가";        
         }else {
            str1 = "탑승가능";
         }
        System.out.println(str1);
    }
    
}
