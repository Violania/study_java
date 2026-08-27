package computer;

public class ComMain {
    public static void main(String[] args) {

        Computer c1 = new Computer();//설계도에서 불러옴 
       
        c1.ssd = 1024; //c1은 객체
        c1.cpu = 3.5f;
        c1.color = "black";
        // private 변수 brand로는 접근이 불가
        // c1.brand = "apple";
        c1.info();
        
        Computer c2 = new Computer();
        c2.info();
        
    }// main
}// class
