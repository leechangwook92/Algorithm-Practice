package Al;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Al66 {
    public static void main(String[] args) {

        // 정수 배열 array와 정수 n이 매개변수로 주어질 때,
        // array에 들어있는 정수 중 n과 가장 가까운 수를 return 하도록 solution 함수를 완성해주세요.

        Al66 a = new Al66();
        int[] arr = {3, 10, 28};

        System.out.println(a.solution(arr,20));
    }

    public int solution(int[] array, int n) {
        Arrays.sort(array);
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= n) {
                int leftValue = n - array[(i - 1)];
                int rightValue = array[i] - n;
                return leftValue <= rightValue ? array[(i - 1)] : array[i];
            }
        }
        return array[array.length - 1];
    }

}
