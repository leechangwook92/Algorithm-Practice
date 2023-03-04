package Al;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Al60 {
    public static void main(String[] args) {

        // 문자열 my_string이 매개변수로 주어질 때,
        // my_string 안에 있는 숫자만 골라 오름차순 정렬한 리스트를 return 하도록 solution 함수를 작성해보세요.
        Al60 a = new Al60();

        String str = "hi12392";

        System.out.println(Arrays.toString(a.solution(str)));
    }

    public int[] solution(String my_string) {

        List<Integer> arr = new ArrayList<>();

        String replaceStr = my_string.replace("[a-z]", "");
        for (String str : replaceStr.split("")) {
            try{
                arr.add(Integer.parseInt(str));
            } catch (NumberFormatException nfe) {
                nfe.printStackTrace();
            }
        }

        Collections.sort(arr);

        int[] answer = new int[arr.size()];

        for (int i = 0; i < arr.size(); i++) {
            answer[i] = arr.get(i);
        }

        return answer;
    }

    public int[] solution2(String my_string) {

        my_string = my_string.replace("[a-z]", "");

        int[] answer = new int[my_string.length()];

        List<String> arr = new ArrayList<>(Arrays.asList(my_string.split("")));

        return arr.stream().sorted().mapToInt(Integer::parseInt).toArray();
    }

}
