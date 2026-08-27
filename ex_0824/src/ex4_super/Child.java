package ex4_super;

public class Child  extends Parent{
    
    public Child(){
        super(10);//현재 자식클래스의 부모을 의미 // 부모클래스의 생성자
        System.out.println("자식클래스의 생성자");
    }

    @Override
    public int getNum() {
        super.num=100;//부모의 num변수로 접근
        //부모우ㅏ getNum메서드 호출
        return super.getNum();
    }
}
