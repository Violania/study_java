package solo1;

import java.util.ArrayList;

public class StudentMain {
    public static void main(String[] args) {

        // 1. 🟢 학생 성적 관리

        // ArrayList와 클래스를 사용해서 학생 성적을 관리하는 프로그램을 만들어라.

        // Student 클래스를 만든다.

        // 필드: name, kor, eng, math
        // 생성자로 초기화
        // 평균을 반환하는 getAverage() 메서드 작성
        // 학생 정보를 출력하는 showInfo() 메서드 작성

        // 메인에서는 학생 5명을 ArrayList<Student>에 저장한다.

        // 그리고 다음을 출력한다.

        // ===== 학생 성적 =====
        // 홍길동 국어:90 영어:80 수학:70 평균:80.0
        // 김철수 국어:80 영어:90 수학:90 평균:86.6
        // ...

        // 전체 평균 : 82.4
        // 최고 점수 학생 : 김철수

        // 조건

        // Student 객체를 직접 만들어서 리스트에 저장
        // 평균 계산은 Student 클래스에서 처리
        // 최고 평균 학생을 찾아야 함

        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("홍길동", 90, 80, 70));
        students.add(new Student("김철수", 80, 90, 90));
        students.add(new Student("이영희", 95, 85, 100));
        students.add(new Student("박민수", 70, 65, 80));
        students.add(new Student("최지우", 85, 95, 90));

        System.out.println("---- 학생 성적 ----");

        float total = 0;
        Student topStudent = students.get(0);

        for(int i = 0; i < students.size(); i++){
            students.get(i).info();
            total += students.get(i).getAvg();

            if(students.get(i).getAvg() > topStudent.getAvg()) {
                topStudent = students.get(i);
            }
        }

        float totalAvg = total/students.size();

        System.out.println();
        System.out.printf("전체 평균 : %.1f%n", totalAvg);
        System.out.println("최고 점수 학생 : " + topStudent.name);

    }
}
