package Al;

import java.util.Arrays;

public class Al79 {
    public static void main(String[] args) {

        // 정수가 담긴 배열 array와 정수 n이 매개변수로 주어질 때, array에 n이 몇 개 있는 지를 return 하도록 solution 함수를 완성해보세요.

        Al79 a1 = new Al79();
        int[] numbers = {1, 2, -3, 4, -5};

        System.out.println(a1.solution(numbers));

    }

    public int solution(int[] numbers) {
        int answer = 0;

        Arrays.sort(numbers);

        int num1 = numbers[0] * numbers[1];
        int num2 = numbers[numbers.length-1] * numbers[numbers.length-2];

        if(num1 < num2) {
            answer = num2;
        } else {
            answer = num1;
        }

        return answer;
    }

}
