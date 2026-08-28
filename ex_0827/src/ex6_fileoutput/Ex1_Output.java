package ex6_fileoutput;

import java.io.File;
import java.io.FileOutputStream;

public class Ex1_Output {
    public static void main(String[] args) {
        
        File f = new File("C:/myfile/fileoutput.txt");
        FileOutputStream fos =null;

        try {
            fos = new FileOutputStream(f,true);//boolean 값으로 주면 기존내용에 추가

            String msg = "\n안녕하세요 반갑습니다";

            
            fos.write(msg.getBytes());


        } catch (Exception e) {
            // TODO: handle exception
        }finally{

            try {
                if (fos != null) {
                    fos.close();
                }
            } catch (Exception e) {
                // TODO: handle exception
            }
        }
    }
}
