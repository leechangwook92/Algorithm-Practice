package Al;

import java.util.Arrays;

public class Al77 {
    public static void main(String[] args) {

        // 문자열 my_str과 n이 매개변수로 주어질 때, my_str을 길이 n씩 잘라서 저장한 배열을 return하도록 solution 함수를 완성해주세요.

        Al77 a1 = new Al77();

        System.out.println(Arrays.toString(a1.solution("abc1Addfggg4556b",6)));

    }

    public String[] solution(String my_str, int n) {
        String[] answer = new String[my_str.length() % n == 0 ? my_str.length() / n : my_str.length()/n+1];

        String[] split = my_str.split("");
        StringBuilder s = new StringBuilder();
        int index = 0;

        for (int i = 0; i < answer.length; i++) {
            for (int j = index; j < split.length; j++) {
                if(s.toString().length() == n) {
                    answer[i] = s.toString();
                    s = new StringBuilder();
                    break;
                }

                s.append(split[index]);
                index++;
                answer[i] = s.toString();
            }
        }

        return answer;
    }

}
