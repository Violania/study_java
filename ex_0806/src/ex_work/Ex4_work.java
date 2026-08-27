package ex_work;

import java.util.Scanner;

public class Ex4_work {
    public static void main(String[] args) {
        /*
        수1 : 10(키보드에서 받음)
        수2 : 20
        연산자 : + //연산자는 .next
        10 + 20 = 30
        */

        Scanner sc = new Scanner(System.in);

        System.out.print( "수1 : ");
        int num1 = sc.nextInt();

        System.out.print( "수2 : ");
        int num2 = sc.nextInt();

        System.out.print( "연산자 : ");
        String op = sc.next();
 
        switch (op) {
            case "+":
                System.out.println( num1 + "+" + num2 + "="+ (num1 + num2));
                break;
            
            case "-":
                System.out.println( num1 + "-" + num2 + "="+ (num1 - num2));
                break;
            
            case "*":
                System.out.println( num1 + "*" + num2 + "="+ (num1 * num2));
                break;        
          
            case "/":
                System.out.println( num1 + "/" + num2 + "="+ ((float)num1 / num2));
                break;    
                
            default:
                System.out.println("연산자 오류");
                break;
                    
          
          
        }

          
            
      // System.out.println( num1 + op + num2 +"=" + (num1 + op + num2) );  안되는것
        






    
        
    }//main
    
}//class
