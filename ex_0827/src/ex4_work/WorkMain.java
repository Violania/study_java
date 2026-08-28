package ex4_work;

import java.io.File;
import java.io.FileInputStream;
import java.util.Scanner;

public class WorkMain {
    public static void main(String[] args) {
        // C;/myfile/work3.txt에서
        // 사용자가 입력받은 값의 출현빈도를 출력하기
        // ----------------------
        // 입력 : 홍
        // 홍의 출현 횟수 : 4

        String path = "C:/myfile/work3.txt";
        File f = new File(path);
        byte[] read = new byte[(int) f.length()];
        FileInputStream fis = null;

        Scanner sc = new Scanner(System.in);
        System.out.print("입력 : ");
        String str = sc.next();

        int cnt = 0;
        if (f.exists()) {

            try {
                fis = new FileInputStream(f);
                fis.read(read);
                String res = new String(read);

                //char s = input.charAt(0):

                for (int i = 0; i < res.length(); i++) {
                    if (str.equals(String.valueOf(res.charAt(i)))) {//(s == read.charAt(i))
                        cnt++;
                    } // if
                } // for
                // System.out.println(res);
                System.out.println(cnt);
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("err");
            } finally {
                try {
                    if (fis != null) {
                        fis.close();
                    }
                } catch (Exception e) {

                }
            } // try
        } // if
    }// main
}// class
