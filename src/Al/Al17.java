package Al;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

public class Al17 {
    public static void main(String[] args) {

        // 정수가 들어 있는 배열 num_list가 매개변수로 주어집니다. num_list의 원소의 순서를 거꾸로 뒤집은 배열을 return하도록 solution 함수를 완성해주세요.

        Al17 a1 = new Al17();
        int[] arr = {1, 2, 3, 4, 5};

        int[] solution = a1.solution(arr);

        for (int i : solution) {
            System.out.println(i);
        }

    }

    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length];

        for(int i = 0; i<num_list.length; i++){
            answer[i] = num_list[num_list.length-i-1];
        }

        return answer;
    }

//    public int[] solution(int[] num_list) {
//        int[] answer = new int[num_list.length];
//        String helper = "";
//        for (int i : num_list) {
//            helper += i;
//        }
//
//        StringBuilder sb = new StringBuilder(helper);
//        String reverse = String.valueOf(sb.reverse());
//        System.out.println("reverse: "+ reverse);
//        String[] split = reverse.split("");
//
//        for (int i = 0; i < split.length; i++) {
//            answer[i] = Integer.parseInt(split[i]);
//        }
//
//        return answer;
//    }
}
