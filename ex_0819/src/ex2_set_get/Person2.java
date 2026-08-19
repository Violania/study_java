package ex2_set_get;

public class Person2 {

    private String name;
    private int age;

    public void setinfo(String name, int age) {
        this.name = name;//this 현재 class자신
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }
}
