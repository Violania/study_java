package solo1;

public class Student {
    String name;
    int kor;
    int eng;
    int math;
  


    public Student ( String name, int kor, int eng, int math){
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    public float getAvg(){
        return (kor + eng + math)/3f; 
    }

    public void info(){
        System.out.printf("%s 국어 : %d, 영어 : %d, 수학 : %d, 평균 : %f", name,kor,eng,math,getAvg());
    }
}
