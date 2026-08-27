package ex1_multi_for;

public class Ex09_mulitifor {
  public static void main(String[] args) {
    /*
     *
     * * *
     * * * * *
     * * * * * * *
     * * * * * * * * *
     */

    for (int i = 0; i < 5; i++) {
      for (int j = 0; j < 5 + i; j++) {
        if (i + j > 3) {
          System.out.printf("* ");
        } else {
          System.out.printf("  ");
        }
      } // inner

      System.out.println();
    } // outer

  }// main
}// class
