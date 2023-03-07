package Al;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Al69 {
    public static void main(String[] args) {

        // 정수 n이 매개변수로 주어질 때, n의 약수를 오름차순으로 담은 배열을 return하도록 solution 함수를 완성해주세요.

        Al69 a = new Al69();

        System.out.println(Arrays.toString(a.solution(24)));
    }


    public int[] solution(int n) {
        List<Integer> arr = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            if(n % i == 0) {
                arr.add(i);
            }
        }

        int[] answer = new int[arr.size()];

        for (int i = 0; i < arr.size(); i++) {
            answer[i] = arr.get(i);
        }

        return answer;
    }

}
