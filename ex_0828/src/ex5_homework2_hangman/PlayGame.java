package ex5_homework2_hangman;

import java.util.Scanner;

public class PlayGame {

    Scanner sc = new Scanner(System.in);
    char[] star;
    boolean check = false;
    boolean isPlaying = false;
    final char SHAPE = '☆';

    public void play(String word) {
        star = new char[word.length()];

        for (int i = 0; i < star.length; i++) {
            star[i] = SHAPE;

        }

        label: while (true) {
            System.out.print("word");
            for (int i = 0; i < star.length; i++) {
                System.err.print(star[i]);
            } // for
            System.out.print(">>");

            String in = sc.next();
            char ch = in.charAt(0);

            if (ch < 'a' || ch > 'z') {
                System.out.println("한글자에 영 소문자만 입력하세요");
                continue;
            } // if
            check = false;
            isPlaying = false;

            for (int i = 0; i < word.length(); i++) {
                if (star[i] == ch) {
                    System.out.println(ch + "은(는) 이미 입력함");
                    continue label;
                }

                if (ch == word.charAt(i)) {
                    star[i] = ch;
                    check = true;
                }

                if (star[i] == SHAPE) {
                    isPlaying = true;// 아직 게임중이야
                }
                if (!check) {
                    System.out.println(ch + "이(가) 포함되지 않음");
                }

                // 게임종료
                if(!isPlaying){
                    System.out.println("정답. 게임종료");
                    break;
                }
            } // for
        } // while
    }// play
}
