package solo;

import java.io.File;
import java.io.FileInputStream;

public class WorkSolo {
    public static void main(String[] args) {

        String path = "C:/myfile/workSolo.txt";
        File f = new File(path);
        FileInputStream fis = null;
        byte[] read = new byte[(int) f.length()];

        String ori = "";
        String rev = "";

        try {
            fis = new FileInputStream(f);
            fis.read(read);
            ori = new String(read).trim();

            StringBuffer sb = new StringBuffer(ori);
            rev = sb.reverse().toString();

            if (ori.equals(rev)) {
                System.out.println(ori + "은(는) 회문입니다");
            } else {
                System.out.println(ori + "은(는) 회문이 아닙니다");
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
