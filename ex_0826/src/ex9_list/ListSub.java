package ex9_list;

public class ListSub {
    
    private String name;
    private int kor;
    private int eng;

    private int total;
    private float avg;

    public ListSub( String name, int kor , int eng){
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        total = kor + eng;
        avg = total / 2f;
    }

    public float getAvg(){
        return avg;
    }

    public void studentInfo(){
        System.out.printf("%s\t국어 : %d\t영어 : %d\t총점 : %d\t평균 : %.1f\n",name,kor,eng,total,avg);
    }
    // public String getName() {
    //     return name;
    // }
    // public void setName(String name) {
    //     this.name = name;
    // }
    // public int getKor() {
    //     return kor;
    // }
    // public void setKor(int kor) {
    //     this.kor = kor;
    // }
    // public int getEng() {
    //     return eng;
    // }
    // public void setEng(int eng) {
    //     this.eng = eng;
    // }

    
}
