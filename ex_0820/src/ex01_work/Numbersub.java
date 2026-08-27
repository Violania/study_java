package ex01_work;

public class Numbersub {
    public String numbercheck(String num) {
        int i = 0;
        for (; i < num.length(); i++) {
            if (num.charAt(i) < '0' || num.charAt(i) > '9') {
                break;
            }

        }

        if (i == num.length()) {
            System.out.printf("%s은(는) 숫자입니까? true", num);
        } else {
            System.out.printf("%s은(는) 숫자입니까? false", num);
        }
        return num;
    }

    // public boolean isNumber(String num) {
    //     for (int i = 0; i < num.length(); i++) {
    //         char ch = num.charAt(i);
    //         if (ch < '0' || ch > '9') {
//     //             return false;
//     //         }
//     //     }
//              return true;

//     // }

 }
