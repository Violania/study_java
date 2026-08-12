package ex_work;

import java.util.Scanner;

public class Ex2_work {
    public static void main(String[] args) {
        
        /*비교값으로 1~12월 사이의 값을 키보드에서 입력
        준비된 비교값에 해당하는 달이 몇일까지 있는지 출력
        ----------------------------
        3월은 31일까지 있습니다
        */
        Scanner sc = new Scanner(System.in); //ctrl space로 임포트
   
        System.out.print("월");
        int mon = sc.nextInt();
        String day =""; 
        switch ( mon ){ 

            case 1:            
            case 3:
            case 5:
            case 7: 
            case 8:
            case 10:
            case 12:
                day = "월은 31일까지 있습니다";
                System.out.println( mon + day);
                break;
            case 2:
                day = "월은 28일 까지 있습니다";
                System.out.println( mon + day );
                break;

            case 4:
            case 6:
            case 9:
            case 11: 
                day = "월은 30일 까지 있습니다";
                System.out.println( mon + day); 
                break;
            
            default:
                System.out.println( mon + "월은 없습니다");
                break;

           //orint mon = 99;
/* 
switch (mon) { 
    case 1:           
    case 3:
    case 5:
    case 7: 
    case 8:
    case 10:
    case 12:
        System.out.println(mon + "월은 31일까지 있습니다.");
        break;
        
    case 2:
        System.out.println(mon + "월은 28일까지 있습니다.");
        break;

    case 4:
    case 6:
    case 9:
    case 11: 
        System.out.println(mon + "월은 30일까지 있습니다."); 
        break;
    
    default:
        System.out.println(mon + "월은 없습니다.");
        break;
        */
                
            


            

                //4 6 9 11


        }//switch

        
    }//main
    
}//class
