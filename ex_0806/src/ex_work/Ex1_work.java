package ex_work;

public class Ex1_work {
    public static void main(String[] args) {
        
        /*
        나이가 15세 이상이거나 키가 150cm 이상이면 탑승가능
        그렇지 않으면 탑승불가를 출력
         */
        //1
        int tall = 140;
        int age = 14;
        String str = "";

        if ( age >= 15) {            
            str = "탑승가능";
        }else if ( tall >= 150 ) {
            str = "탑승가능";
        }else {
            str = "탑승불가";
        }
        System.out.println( str );

        //2 ||연산자 사용
        int age1 = 15;
        int height = 161;
        String str1 = "";
        if( age1 >= 15 || height >= 150){
            str1 = "탑승가능";
        }else{
            str1 = "탑승불가";
        }
        
        System.out.println( str1 );

        //3 삼항연산자버전 

        str1 = ( age1 >= 15 || height >=150 ) ? "탑승가능" : "탑승불가"; 
        System.out.println(str1);

       
    }
    
}
