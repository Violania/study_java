package ex2_set_get;

public class PersonMain {
    public static void main(String[] args) {
        //입력과 호출이 같으면
        //값의 변경가능성 있음
        //누구나 접근 가능하여 보안성이 낮음

        Person p1 = new Person();
        p1.setGender("여자");
        System.out.println("성별 : " + p1.getGender());

        p1.setName("홍길동");
        System.out.println("이름 : "+ p1.getName());
        
        p1.setAge(30);
        System.out.println("나이 : " + p1.getAge());


       System.out.println("---------------------");
       
       Person2 p2 = new Person2();
       p2.setinfo("홍길동", 30);

       System.out.println("이름 : " + p2.getName());
       System.out.println("나이 : " + p2.getAge());
    }
}
