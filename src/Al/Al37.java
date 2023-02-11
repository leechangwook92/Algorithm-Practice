package Al;

import java.util.ArrayList;
import java.util.Collections;

public class Al37 {
    public static void main(String[] args) {

        // 영어 대소문자로 이루어진 문자열 my_string이 매개변수로 주어질 때, my_string을 모두 소문자로 바꾸고 알파벳 순서대로 정렬한 문자열을 return 하도록 solution 함수를 완성해보세요.

        Al37 p = new Al37();
        String A = "Bcad";
        System.out.println(p.solution(A));

    }

    public String solution(String my_string) {
        StringBuilder answer = new StringBuilder();
        ArrayList<String> arr = new ArrayList<>();

        my_string = my_string.toLowerCase();

        for (char s : my_string.toCharArray()) {
            arr.add(String.valueOf(s));
        }

        Collections.sort(arr);
        for (String s : arr) {
            answer.append(s);
        }

        return answer.toString();
    }

}
