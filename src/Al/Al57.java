package Al;

public class Al57 {
    public static void main(String[] args) {

        // 약수의 개수가 세 개 이상인 수를 합성수라고 합니다.
        // 자연수 n이 매개변수로 주어질 때 n이하의 합성수의 개수를 return하도록 solution 함수를 완성해주세요.

        Al57 a = new Al57();

        System.out.println(a.solution(10));
        System.out.println(a.solution(15));
    }

    public int solution(int n) {
        int answer = 0;

        for(int i = 4; i <= n; i++) {
            int cnt = 0;

            for(int j = 1; j <= i; j++) {
                if(i % j == 0) cnt ++;
            }

            if(cnt > 2) {
                answer ++;
            }
        }

        return answer;
    }

}
