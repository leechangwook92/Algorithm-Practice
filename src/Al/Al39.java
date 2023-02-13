package Al;

import java.util.Objects;

public class Al39 {
    public static void main(String[] args) {

        // 영어에선 a, e, i, o, u 다섯 가지 알파벳을 모음으로 분류합니다.
        // 문자열 my_string이 매개변수로 주어질 때 모음을 제거한 문자열을 return하도록 solution 함수를 완성해주세요.

        Al39 p = new Al39();
        String A = "nice to meet you";
        System.out.println(p.solution2(A));

    }

    public String solution(String my_string) {
        StringBuilder answer = new StringBuilder();

        String[] split = my_string.split("");

        for (String s : split) {
            if(!Objects.equals(s, "a") && !Objects.equals(s, "e") && !Objects.equals(s, "i") && !Objects.equals(s, "o") && !Objects.equals(s, "u")) {
                answer.append(s);
            }
        }

        return answer.toString();
    }

    public String solution2(String my_string) {
        String answer = "";
        answer = my_string.replaceAll("[aeiou]","");
        return answer;
    }

}
