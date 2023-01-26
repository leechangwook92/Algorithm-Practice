package Al;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

public class Al20 {
    public static void main(String[] args) {

        // 문자열 s에 나타나는 문자를 큰것부터 작은 순으로 정렬해 새로운 문자열을 리턴하는 함수, solution을 완성해주세요.
        // s는 영문 대소문자로만 구성되어 있으며, 대문자는 소문자보다 작은 것으로 간주합니다.

        Al20 a1 = new Al20();
        String solution = a1.solution("Zbcdefg");
        System.out.println(solution);

    }

    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        String[] split = s.split("");

        List<String> list = new ArrayList<>(Arrays.asList(split));

        Collections.sort(list);

        for (String s1 : list) {
            sb.append(s1);
        }

        return sb.reverse().toString();
    }

}
