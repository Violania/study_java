package ex01_array;

public class Ex03_array {
    public static void main(String[] args) {

        char[] ch = new char[4];

        ch[0] = 'J';
        ch[1] = 'A';
        ch[2] = 'V';
        ch[3] = 'A';
        // char [] ch= {'J', 'A', 'V', 'A'}; //미리 선언되어있으면 불가능

        for (int i = 0; i < ch.length; i++)
            System.out.print(ch[i]);
        
        
        System.out.println();
        System.out.println("-------------------");

        char[] ch2 = { 'J', 'A', 'V', 'A' };
        for (int i = 0; i < ch.length; i++)
            System.out.print(ch[i]);



    }// main
}// class
