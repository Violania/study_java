package ex02_work;

public class Encodesub {

    char[] abcCode = { '`', '~', '!', '@', '#', '$', '%', '^', '&', '*', '(', ')', '-', '_', '+', '=', '|', '[', ']',
            '{', '}', ';', ':', ',', '.', '/' };

    char[] numCode = { 'q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p' };

    // char[] abccodein = new char[abcCode.length];

    // for (int i = 0; i < abcCode.length; i++) {
    // abcCode[i] = abccodein[i];

    // }
    //String encode = "";
    StringBuffer encode = new StringBuffer();

    public String encoding(String code) {

        for (int i = 0; i < code.length(); i++) {
            
            char ch = code.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                 encode.append(abcCode[ch-'a']);
                // encode += abcCode[ch-'a'];
                // code.charAt(i) = abcCode[i];
                // return encode;

            } else if (ch >= '0' && ch <= '9' ) {
                encode.append( abcCode[ch-'0']);
                //encode += abcCode[ch-'0'];
                // code.charAt(i) = numCode[i];
                // return encode;

            }

        }
        return encode.toString();
        
    }
}
