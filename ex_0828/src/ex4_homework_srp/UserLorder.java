package ex4_homework_srp;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class UserLorder {
    private User user;
    private FileInputStream fis = null;
    private ObjectInputStream ois = null;

    public User loadInfo(String tel){
        String path = "C:/myfile/RSPUser/" + tel + "/save.sav";

        File f = new File(path);

        if (f.exists()) {

            try {
                fis = new FileInputStream(f);
                ois = new ObjectInputStream(fis);

                user = (User)ois.readObject();

            } catch (Exception e) {
                // TODO: handle exception
            }finally{

                try {
                    if(ois != null) ois.close();
                    if(fis != null) fis.close();

                } catch (Exception e) {
                    // TODO: handle exception
                }
            }
            
        }else{
            System.out.println("해당유저의 정보가 없습니다");
        }
        return user;
    }
}
