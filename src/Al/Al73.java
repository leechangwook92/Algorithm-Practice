package Al;

public class Al73 {
    public static void main(String[] args) {

        // 어떤 자연수를 제곱했을 때 나오는 정수를 제곱수라고 합니다.
        // 정수 n이 매개변수로 주어질 때, n이 제곱수라면 1을 아니라면 2를 return하도록 solution 함수를 완성해주세요.

        Al73 a1 = new Al73();

        System.out.println(a1.solution(144));

    }

    public int solution(int n) {
        int answer = 0;

        double sqrt = Math.sqrt(n);

        if((int)sqrt * (int)sqrt == n ) {
            answer = 1;
        } else {
            answer = 2;
        }

        return answer;
    }

}
