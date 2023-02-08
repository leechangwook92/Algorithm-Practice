package Al;
import java.util.Scanner;

public class Al34 {
    public static void main(String[] args) {

        // 문자열 str1, str2가 매개변수로 주어집니다. str1 안에 str2가 있다면 1을 없다면 2를 return하도록 solution 함수를 완성해주세요.

        Al34 al = new Al34();
        String str1 = "ab6CDE443fgh22iJKlmn1o";
        String str2 = "6CD";
        System.out.println(al.solution(str1, str2));
    }

    public int solution(String str1, String str2) {
        int answer = 0;
        String str3 = str1;

        String s = str1.replaceAll(str2, "");

        if(s.equals(str3)) {
            answer = 2;
        } else {
            answer = 1;
        }

        return answer;
    }

}
