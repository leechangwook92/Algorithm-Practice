package Al;

import java.util.Scanner;

public class Al42 {
    public static void main(String[] args) {

        // "*"의 높이와 너비를 1이라고 했을 때,
        // "*"을 이용해 직각 이등변 삼각형을 그리려고합니다.
        // 정수 n 이 주어지면 높이와 너비가 n 인 직각 이등변 삼각형을 출력하도록 코드를 작성해보세요.

        Al42 a = new Al42();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (String x : a.solution(n)) {
            System.out.println(x);
        }

    }

    public String[] solution(int n) {
        String[] answer = new String[n];
        String star = "*";

        for (int i = 0; i < n; i++) {
            answer[i] = star.repeat(i+1);
        }

        return answer;
    }


}
