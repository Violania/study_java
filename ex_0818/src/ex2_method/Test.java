package ex2_method;

public class Test {

    public String average(int s1, int s2, int s3) {

        int num = s1 + s2 + s3 / 3;

        if (num > 50) {
            return "합격";
        } else {
            return "불합격";
        }

    }

}
