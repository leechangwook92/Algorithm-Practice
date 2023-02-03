package Al;
import java.util.Scanner;

public class Al27 {
    public static void main(String[] args) {

        // 영어 알파벳과 특수문자로 구성된 문자열이 주어지면 영어 알파벳만 뒤집고,
        // 특수문자는 자기 자리에 그대로 있는 문자열을 만들어 출력하는 프로그램을 작성하세요.

        Al27 al = new Al27();

        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(al.solution(str));
    }

    public String solution(String str) {
        String answer = "";

        char[] chars = str.toCharArray();

        int fi = 0, li = chars.length-1;

        // Character.isAlphabetic(인자) 알파벳인지 판별해줌

        while (fi < li) {
            if(!Character.isAlphabetic(chars[fi])) {
                fi++;
            } else if (!Character.isAlphabetic(chars[li])) {
                li--;
            } else {
                char tmp = chars[fi];
                chars[fi] = chars[li];
                chars[li] = tmp;
                fi++;
                li--;
            }
        }

        answer = String.valueOf(chars);

        return answer;
    }

}
