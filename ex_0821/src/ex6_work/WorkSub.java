package ex6_work;

public class WorkSub {

    public boolean isPrime(int n) {

        int i = 2;//1은 제외

        for (; i <= n; i++) {
            if (n % i == 0)
                break;
        }

        if (i == n)
            return true;
        else
            return false;
    }

    // public boolean print(boolean res ,){
    //     if (res) {
    //         System.out.println(n + "은(는) 소수입니다");
    //     } else
    //         System.out.println(n + "은(는) 소수가 아닙니다");
    // }

}
