package ex2_while;

public class Ex4_do_while {
    public static void main(String[] args) {

        /*
         * do-while
         * 선처리 후비교
         */
        
        int i = 11;
        
        do {

            System.out.println(i);
            i++;
            
        } while (i <= 10);

//다른결과가 나옴
        int j = 11;

        while (j <= 10) {
            System.out.println(j);
            j++;
        }

    }// main
}// class
