package Al;

public class Al59 {
    public static void main(String[] args) {

        // i팩토리얼 (i!)은 1부터 i까지 정수의 곱을 의미합니다.
        // 예를들어 5! = 5 * 4 * 3 * 2 * 1 = 120 입니다.
        // 정수 n이 주어질 때 다음 조건을 만족하는 가장 큰 정수 i를 return 하도록 solution 함수를 완성해주세요.

        Al59 a = new Al59();

        System.out.println(a.solution(3628800));
    }

    public int solution(int n) {
        if (n == 1) return 1;

        int answer = 0;

        while (n > 1){
            answer++;
            n /= answer;
        }

        if (n == 1) {
            return answer;
        } else {
            return answer - 1;
        }
    }

    public int solution2(int n) {
        int[] num = {1, 2, 6, 24, 120, 720, 5040, 40320, 362880, 3628800};

        int answer = 0;
        for(int i = 0; i < num.length; i++){
            if(n >= num[i]){
                answer = i + 1;
            }
        }
        return answer;
    }

}
