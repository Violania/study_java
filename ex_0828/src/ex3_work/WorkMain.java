package ex3_work;

// import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class WorkMain {
    public static void main(String[] args) {
        // 1~ 45 사이의 중복되지 않는 난수 6개를 출력하는
        // 로또번호 생성기 만들기
        // set 중복값을 허용하지 않는 자바의 interface
        // TreeSet 오름차순 정렬

        Set<Integer> set = new TreeSet<Integer>();

        Random rnd = new Random();

        while (set.size() < 6) {
           
            set.add(rnd.nextInt(45) + 1);
        }
        System.out.println(set);

        //set에 담긴내용 정수배열에 복사
        Integer [] arr = set.toArray(new Integer[0]);

        for(int num : arr){
            System.out.print(num + " ");
        }
    }
}
