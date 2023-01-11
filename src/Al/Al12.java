package Al;


import java.util.ArrayList;
import java.util.List;

public class Al12 {
    public static void main(String[] args) {

        Al12 a1 = new Al12();

        int[] solution = a1.solution(15);

        for (int i : solution) {
            System.out.println(i);
        }

    }

    public int[] solution(int n) {
        List<Integer> arr = new ArrayList<>();
        for(int i = 1; i <= n; i++) {
            if(i %2 != 0) {
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
