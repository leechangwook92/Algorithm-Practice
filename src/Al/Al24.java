package Al;
import java.util.Scanner;

public class Al24 {
    public static void main(String[] args) {

        // 설명
        //대문자와 소문자가 같이 존재하는 문자열을 입력받아 대문자는 소문자로 소문자는 대문자로 변환하여 출력하는 프로그램을 작성하세요.
        //입력
        //첫 줄에 문자열이 입력된다. 문자열의 길이는 100을 넘지 않습니다.
        //문자열은 영어 알파벳으로만 구성되어 있습니다.
        //출력
        Al24 al = new Al24();

        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.print(al.solution(s));

    }

    public String solution(String s) {
        StringBuilder answer = new StringBuilder();

//        for (char c : s.toCharArray()) {
//            if(c >= 97) {
//                answer.append(Character.toUpperCase(c));
//            } else {
//                answer.append(Character.toLowerCase(c));
//            }
//        }
        // 아스키코드방식

        // Character의 isLowerCase 소문자인지 확인하는 메소드를 사용해 참이면 대문자로 변환 거짓이면 else문을 타니 그 반대
        for (char x : s.toCharArray()) {
            if(Character.isLowerCase(x)) {
                answer.append(Character.toUpperCase(x));
            } else {
                answer.append(Character.toLowerCase(x));
            }
        }

        return answer.toString();
    }

}
