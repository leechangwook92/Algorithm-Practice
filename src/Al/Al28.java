package Al;
import java.util.Scanner;

public class Al28 {
    public static void main(String[] args) {

        // 영어 알파벳과 특수문자로 구성된 문자열이 주어지면 영어 알파벳만 뒤집고,
        // 특수문자는 자기 자리에 그대로 있는 문자열을 만들어 출력하는 프로그램을 작성하세요.

        Al28 al = new Al28();

        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(al.solution(str));
    }

    public String solution(String str) {
        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
             if(str.indexOf(str.charAt(i)) == i) {
                 answer.append(str.charAt(i));
             }
        }

        return answer.toString();
    }

}
