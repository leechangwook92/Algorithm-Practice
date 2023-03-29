package Al;

import java.util.stream.Stream;

public class Al85 {
    public static void main(String[] args) {

        // 이진수를 의미하는 두 개의 문자열 bin1과 bin2가 매개변수로 주어질 때, 두 이진수의 합을 return하도록 solution 함수를 완성해주세요.

        Al85 a1 = new Al85();

        System.out.println(a1.solution("10", "11"));

    }

    public String solution(String bin1, String bin2) {
        String answer = "";
        Integer b1 = Integer.valueOf(bin1, 2);
        Integer b2 = Integer.valueOf(bin2, 2);

        int sum = b1 + b2;
        String s = Integer.toBinaryString(sum);

        answer += s;

        return answer;
    }

}
