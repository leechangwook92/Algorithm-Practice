package Al;

import java.util.Arrays;

public class Al44 {
    public static void main(String[] args) {

        // 문자열 before와 after가 매개변수로 주어질 때,
        // before의 순서를 바꾸어 after를 만들 수 있으면 1을, 만들 수 없으면 0을 return 하도록 solution 함수를 완성해보세요.

        Al44 a = new Al44();

        System.out.println(a.solution("olleh", "hello"));

    }

    public int solution(String before, String after) {
        int answer = 0;

        char[] chars = before.toCharArray();
        char[] chars2 = after.toCharArray();

        Arrays.sort(chars);
        Arrays.sort(chars2);

        if(String.valueOf(chars).equals(String.valueOf(chars2))) {
            answer = 1;
        } else {
            answer = 0;
        }

        return answer;
    }


}
