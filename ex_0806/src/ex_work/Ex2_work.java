package ex_work;

public class Ex2_work {
    public static void main(String[] args) {
        /*
         * [응용 연습문제]
         * 
         * 1. 나이가 20세 이상이고 키가 160cm 이상이면 "VIP 탑승가능"을 출력하고,
         * 그렇지 않으면 "일반탑승 또는 탑승불가"를 출력하세요.
         * 
         * 2. 나이가 10세 미만이거나 키가 130cm 미만이면 "탑승불가"를 출력하고,
         * 그렇지 않으면 "탑승가능"을 출력하세요.
         * 
         * (정답은 따로 요청하세요)
         */
        /*
         * [정답]
         * 
         * // 1. 나이가 20세 이상이고 키가 160cm 이상이면 "VIP 탑승가능"
         * // 그렇지 않으면 "일반탑승 또는 탑승불가"
         * int age = 20;
         * int height = 150;
         * String str = "";
         * if (age >= 20 && height >= 160) {
         * str = "VIP 탑승가능";
         * } else {
         * str = "일반탑승 또는 탑승불가";
         * }
         * System.out.println(str);
         * 
         * // 2. 나이가 10세 미만이거나 키가 130cm 미만이면 "탑승불가"
         * // 그렇지 않으면 "탑승가능"
         * int age1 = 10;
         * int height1 = 129;
         * String str1 = "";
         * if (age1 < 10 || height1 < 130) {
         * str1 = "탑승불가";
         * } else {
         * str1 = "탑승가능";
         * }
         * System.out.println(str1);
         */

        // 1
        int age = 20;
        int height = 150;
        String str = "";
        if (age >= 20 && height >= 160) {
            str = "VIP 탑승가능";
        } else {
            str = "일반탑승 또는 탑승불가";
        }
        System.out.println(str);

        // 삼항연산자
        str = (age >= 20 && height >= 160) ? "VIP 탑승가능" : "일반탑승 또는 탑승불가";
        System.out.println(str);

        // 2
        int age1 = 10;
        int height1 = 129;
        String str1 = "";
        if (age1 < 10 || height1 < 130) {
            str1 = "탑승불가";
        } else {
            str1 = "탑승가능";
        }
        System.out.println(str1);

        // 삼항연산자
        str1 = (age1 < 10 || height1 < 130) ? "탑승불가" : "탑승가능";
        System.out.println(str1);

        /*
         * 연습문제:
         * 변수 age2에 나이를 저장하고,
         * 65세 이상이면 "무료 승차입니다"를,
         * 그렇지 않으면 "일반 요금입니다"를 출력하는 if문을 작성하세요.
         * 
         * (아래는 정답예시입니다)
         * 
         * int age2 = 67;
         * String result = "";
         * if (age2 >= 65) {
         * result = "무료 승차입니다";
         * } else {
         * result = "일반 요금입니다";
         * }
         * System.out.println(result);
         */

        int age2 = 53;
        String str2 = "";

        if (age2 >= 65) {
            str2 = "무료승차입니다";
        } else {
            str2 = "일반요금입니다";
        }
        System.out.println(str2);
        //삼항연산자
        str2 = (age2 >= 65) ? "무료승차입니다" : "일반요금입니다";
        System.out.println(str2);

        /*
         * 연습문제:
         * 변수 age3에 나이를 저장하고,
         * - 65세 이상이면 "경로우대 요금입니다",
         * - 20세 이상 65세 미만이면 "성인요금입니다",
         * - 14세 이상 20세 미만이면 "청소년요금입니다",
         * - 8세 이상 14세 미만이면 "어린이요금입니다",
         * - 8세 미만이면 "유아요금입니다"
         * 를 출력하는 if~else if문을 작성하세요.
         * (단, 정답 코드는 작성하지 마세요.)
         */

        int age3 = 48;
        String fee = "";
        if (age3 >= 65) {
            fee = "경로우대 요금입니다";
        }else if(age3 >= 20){
            fee = "성인요금입니다";
        }else if(age3 >= 14){
            fee = "청소년요금입니다";
        }else{
            fee = "유아요금입니다";
        }
        System.out.println(fee);

    
  

    }
}
