package Al;

public class Al41 {
    public static void main(String[] args) {

        // 정수가 담긴 리스트 num_list가 주어질 때,
        // num_list의 원소 중 짝수와 홀수의 개수를 담은 배열을 return 하도록 solution 함수를 완성해보세요.

        Al41 p = new Al41();

        int[] arr = {1, 2, 3, 4, 5};

        for (int i : p.solution(arr)) {
            System.out.println(i);
        }

    }

    public int[] solution(int[] num_list) {
        int[] answer = new int[2];
        int oddNum = 0, even = 0;

        for (int i : num_list) {
            if(i %2 == 0) {
                even++;
            } else {
                oddNum++;
            }
        }

        answer[0] = even;
        answer[1] = oddNum;

        return answer;
    }


}
