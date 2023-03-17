package Al;

import java.util.Arrays;

public class Al78 {
    public static void main(String[] args) {

        // 정수가 담긴 배열 array와 정수 n이 매개변수로 주어질 때, array에 n이 몇 개 있는 지를 return 하도록 solution 함수를 완성해보세요.

        Al78 a1 = new Al78();
        int[] arr = {1, 1, 2, 3, 4, 5};

        System.out.println(a1.solution(arr, 1));

    }

    public int solution(int[] array, int n) {
        return (int) Arrays.stream(array).filter((i) -> i == n).count();
    }

}
