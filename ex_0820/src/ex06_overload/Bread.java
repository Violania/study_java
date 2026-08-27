package ex06_overload;

public class Bread {

    // 메서드1
    public void makeBread() {
        System.out.println("빵을 만들었습니다\n");
    }

    // 메서드2
    public void makeBread(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("빵을 만들었습니다");
        }
        System.out.printf("요청하신 %d개의 빵을 만들었습니다\n", n);
    }

    // 메서드3
    public void makeBread(String str, int n) {
        for (int i = 0; i < n; i++) {
            System.out.printf("%s빵을 만들었습니다\n", str);
        }
        System.out.printf("요청하신 %d개의 %s빵을 만들었습니다\n", n, str);
    }
}
