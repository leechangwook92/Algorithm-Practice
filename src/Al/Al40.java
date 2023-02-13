package Al;

public class Al40 {
    public static void main(String[] args) {

        // 문자열 my_string과 정수 n이 매개변수로 주어질 때,
        // my_string에 들어있는 각 문자를 n만큼 반복한 문자열을 return 하도록 solution 함수를 완성해보세요.

        Al40 p = new Al40();
        String A = "hello";
        int n = 3;
        System.out.println(p.solution(A, n));

    }

    public String solution(String my_string, int n) {
        String answer = "";
        String[] split = my_string.split("");
        for (String s : split) {
            answer += s.repeat(n);
        }

        return answer;
    }


}
