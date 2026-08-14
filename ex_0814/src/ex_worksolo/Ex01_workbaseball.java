package ex_worksolo;

import java.util.Random;
import java.util.Scanner;

public class Ex01_workbaseball {
    public static void main(String[] args) {
        // 세자리 수를 입력하세요(예:123) - 123
        // 1Strike, 1Ball
        // --------------------------
        // 세자리 수를 입력하세요(예:123) - 567
        // OUT!!
        // --------------------------
        // 세자리 수를 입력하세요(예:123) - 214
        // 0Strike, 3Ball
        // --------------------------
        // 세자리 수를 입력하세요(예:123) - 142
        // 4회 정답 !! - 142

        Scanner sc =new Scanner(System.in);

        String[] baseball = new String[3];
        System.out.print("세자리 수를 입력하세요 : ");
        String num = sc.next();

        System.out.print("정답 : ");
        
        
        outer: for (int i = 0; i < baseball.length; ) {
            int pitch = new Random().nextInt(9 )+1;
            baseball[i] = ;
            
            for (int j = 0; j < i; j++) {
                
                if( baseball[i] == baseball[j]){
                    continue outer;
                }                
            }
            System.out.print(baseball[i]);
            i++;
            
        }

        for (int i = 0; i < baseball.length; i++) {
            for (int j = 0; j < baseball.length; j++) {
               
                if(){}
                
            }
            
        }
//굳이 난수 3만들어야 하나 3자리 수로 만들면 안되나 ==>숫자 중복없어야함 
        System.out.println();
       // int answer = (baseball[0]*100)+(baseball[1]*10)+baseball[2]; 

        
        
        System.out.println(answer);



    }//main
}//class
