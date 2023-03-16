package Al;


import java.util.Arrays;

public class Al72 {
    public static void main(String[] args) {

        // 덧셈, 뺄셈 수식들이 'X [연산자] Y = Z' 형태로 들어있는 문자열 배열 quiz가 매개변수로 주어집니다.
        // 수식이 옳다면 "O"를 틀리다면 "X"를 순서대로 담은 배열을 return하도록 solution 함수를 완성해주세요.

        Al72 a1 = new Al72();

        String[] arr = {"3 - 4 = -3", "5 + 6 = 11"};
        String[] arr2 = {"19 - 6 = 13", "5 + 66 = 71", "5 - 15 = 63", "3 - 1 = 2"};

        System.out.println(Arrays.toString(a1.solution(arr)));

    }

    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];

        for (int i=0; i < quiz.length; i++) {
            String[] split = quiz[i].split(" ");

            if(split[1].equals("-")) {
                if(Integer.parseInt(split[0]) - Integer.parseInt(split[2]) == Integer.parseInt(split[4])) {
                    answer[i] = "O";
                } else {
                    answer[i] = "X";
                }
            }

            if(split[1].equals("+")) {
                if(Integer.parseInt(split[0]) + Integer.parseInt(split[2]) == Integer.parseInt(split[4])) {
                    answer[i] = "O";
                } else {
                    answer[i] = "X";
                }
            }
        }

        return answer;
    }

}
