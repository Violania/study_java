package ex1_multi_for;

public class Ex9_mulitifor {
    public static void main(String[] args) {
        /*     
                *
              * * * 
            * * * * *
          * * * * * * *
        * * * * * * * * *
        */

        for (int i = 1; i <= 5; i++) {
            for (int j = 0; j < i; j++) {
              
                System.out.printf(" * ", j);

            } // inner
            System.out.println();
        } // outer

    }//main 
}//class
