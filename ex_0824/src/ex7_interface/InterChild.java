package ex7_interface;

//인터페이스는 implements를 통해서 '구현'ㅎ나다
public class InterChild implements InterParent{
    //부모인 인터페이스가 가진 추상메서드를 자식이 반드시 가지고 있어야한다
    @Override
    public int getValue(){
        return 0;
    }

    
}
