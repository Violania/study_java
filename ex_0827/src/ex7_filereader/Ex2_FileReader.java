package ex7_filereader;

import java.io.File;
import java.io.FileReader;

public class Ex2_FileReader {
    public static void main(String[] args) {
        
        //C:/myfile/work3.txt의 내용을 읽어서 
        //대문자와 소문자의 갯수를 판별하자
        // ---------------------------------
        // 대문자 : 1
        // 소문자 : 23

        String path = "C:/myfile/work3.txt";
        File f = new File(path);

        FileReader fr =null;

        try {
            fr = new FileReader(f);
            int code = 0;

            int upper = 0;
            int lower = 0;
            while ((code = fr.read()) != -1) {
                
               // System.out.print((char)code);

               if (code >= 'A' && code <= 'Z'  ) {
                upper++;
               }else{
                lower++;
               }
                
            }
            
            System.out.println("대문자 : " + upper);
            System.out.println("소문자 : " + lower);

        } catch (Exception e) {
           
        }finally{

            try {
                if (fr != null) {
                    fr.close();
                }
            } catch (Exception e) {
                // TODO: handle exception
            }
        }



    }//main

}
