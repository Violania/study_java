package rsp;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class ScoreWrite {
    
    public void save(User user){

        String path = "C:/myfile/RspGmae/"+user.getId()+"info.sav";
        File dir = new File( "C:/myfile/RspGmae/"+user.getId());

 
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
    

        if (!dir.exists()) {
            dir.mkdirs();
        }

        try {

            fos = new FileOutputStream(path);
            oos = new ObjectOutputStream(fos);

            oos.writeObject(user);

            System.out.println("기록저장");

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("유저정보 저장 실패");
        } finally {

            try {
                if (oos != null)
                    oos.close();

                if (fos != null)
                    fos.close();

            } catch (Exception e) {
                // TODO: handle exception
            }
           
        }

    }
}
