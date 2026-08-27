package ex5_work;

public class Calsub {

    public int cal(int su1, int su2, String op) {

        switch (op) {
            case "+":
                // System.out.printf("%d %s %d = %d", su1, op, su2, su1 + su2);
                return su1 + su2;
            case "-":
                // System.out.printf("%d %s %d = %d", su1, op, su2, su1 + -su2);
                return su1 - su2;
               
            case "*":
                // System.out.printf("%d %s %d = %d", su1, op, su2, su1 * su2);
                return su1 * su2;
                
            case "/":
                // System.out.printf("%d %s %d = %d", su1, op, su2, su1 / su2);
                return su1 / su2;

            default:
                System.out.println("연산기호가 올바르지 않습니다");
                return -1;    
                

            // }

            // if (op.equals("+") && op.equals("-") && op.equals("*") && op.equals("/")) {
            // System.out.printf("%d %s %d = %d", su1, op, su2, su1 + op + su2);
            // } else {
            // System.out.println("연산자가 올바르지 않습니다");

        }

    }

}
