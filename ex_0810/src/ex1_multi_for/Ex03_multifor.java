package ex1_multi_for;

public class Ex03_multifor {
    public static void main(String[] args) {
        // A B C D
        // E F G H
        // I J K L

        int cnt = 'a';

        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 4; j++) {
                System.out.printf("%C ", cnt++);
            }
            System.out.println();
        }
        System.out.println("------------------------");

        char ch = 'A';

        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 4; j++) {
                System.out.print(ch++ + " ");
            }
            System.out.println();
        }
    }// main

}// class
