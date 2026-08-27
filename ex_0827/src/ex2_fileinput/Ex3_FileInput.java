package ex2_fileinput;

//import java.util.Scanner;

public class Ex3_FileInput {
    public static void main(String[] args) {

        // Scanner sc =new Scanner(System.in);
        // sc.close();
        byte [] console = new byte[100];
        try {
            
            System.out.print("입력 : ");
            System.in.read(console);

            String res = new String(console);
            System.out.println(res.trim());

            //System.in.close();

        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
