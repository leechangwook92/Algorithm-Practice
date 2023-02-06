package Al;
import java.util.Scanner;

public class Al29 {
    public static void main(String[] args) {

        // 앞에서 읽을 때나 뒤에서 읽을 때나 같은 문자열을 회문 문자열이라고 합니다.
        // 문자열이 입력되면 해당 문자열이 회문 문자열이면 "YES", 회문 문자열이 아니면 “NO"를 출력하는 프로그램을 작성하세요.
        // 단 회문을 검사할 때 대소문자를 구분하지 않습니다.

        Al29 al = new Al29();

        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(al.solution(str));
    }

    public String solution(String str) {
        String answer = "";
        String st = str.toLowerCase();

        char[] chars = st.toCharArray();
        int fi = 0 , li= chars.length-1;

        while (fi < li) {
            if(chars[fi] == chars[li]) {
                answer = "YES";
                fi++;
                li--;
            } else {
                answer = "NO";
                break;
            }
        }

        return answer;
    }

    public String solution2(String str) {
        String answer = "NO";
        String st = new StringBuilder(str).reverse().toString();
        if(str.equalsIgnoreCase(st)) answer = "YES";
        return answer;
    }

}
