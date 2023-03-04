package Al;

import java.util.Arrays;

public class Al61 {
    public static void main(String[] args) {

        // 문자열 my_string이 매개변수로 주어집니다.
        // my_string안의 모든 자연수들의 합을 return하도록 solution 함수를 완성해주세요.
        Al61 a = new Al61();

        String str = "aAb1B2cC34oOp";

        System.out.println(a.solution(str));
    }

    public int solution(String my_string) {
        int answer = 0;

        my_string = my_string.replaceAll("[a-z,A-Z]","");
        String[] split = my_string.split("");

        for (String s : split) {
            answer += Integer.parseInt(s);
        }

        return answer;
    }

}
