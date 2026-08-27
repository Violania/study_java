package ex2_fileinput;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Ex5_work {
    public static void main(String[] args) throws IOException{

        // C:/myfile/work2.txt의 내용을 읽어서
        // 회문인지 판단하시오
        // -------------------
        // 토마토은(는) 회문입니다

        String path = "C:/myfile/work2.txt";
        File f = new File(path);
        FileInputStream fis = null;
        byte[] read = new byte[(int) f.length()];

        String ori = "";
        String rev = "";

        try {
            fis = new FileInputStream(f);
            fis.read(read);
            ori = new String(read).trim();

            StringBuffer sb = new StringBuffer();
            rev = sb.reverse().toString();
            // 원본 문자열을 뒤집어서 rev에 저장
            // for (int i = ori.length() - 1; i >= 0; i--) {

            // rev += ori.charAt(i);
            // }
            if (ori.equals(rev)) {
                System.out.println(ori + "은(는) 회문");
            } else {
                System.out.println(ori + "은(는) 안회문");
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("err");
        } finally {
            try {
                if (fis != null) {
                    fis.close();
                }
            } catch (Exception e) {
                // TODO: handle exception
            
            }
        }

    }
}
