package ex3_stringbuffer;

public class Ex1_StringBuffer {
    public static void main(String[] args) {

        String str = "안녕";
        str = "반갑습니다";
        str += "!";
        System.out.println(str);

        //String의 불변의 법칙으로인한 메모리 낭비를 막기위한 방법(여러개의 메모리를 만드는 것이 아님)
        StringBuffer sb = new StringBuffer("안녕");
        sb.setLength(0);
        sb.append("반가워요");
        sb.append("!!!");
        System.out.println(sb.toString());
        
    }
}
