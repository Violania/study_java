package ex2_statement;

public class Ex2_switch {
    public static void main(String[] args) {

        String str = "Y";
        String res = "";

        switch ( str ){ //비교값

            case"A": //조건값
                res = "100~90";
                break; //빠지면 다음 break까지 진행됨 ,나가는 시점 조절함

            case"B":
                res = "89~80";
                break;

            case"C":
                res = "79~70";
                break;

            case"D":
                res = "69~60";
                break;

            case"F":
                res = "59점 이하";
                break;
            
            default:
                res = "올바른 성적을 입력하세요";
                break;
       
        }//switch

        System.out.println(res);
    }//main
        
        
}
    

