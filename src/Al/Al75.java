package Al;

import java.util.Arrays;

public class Al75 {
    public static void main(String[] args) {

        // 머쓱이는 학교에서 키 순으로 줄을 설 때 몇 번째로 서야 하는지 궁금해졌습니다.
        // 머쓱이네 반 친구들의 키가 담긴 정수 배열 array와 머쓱이의 키 height가 매개변수로 주어질 때,
        // 머쓱이보다 키 큰 사람 수를 return 하도록 solution 함수를 완성해보세요.

        Al75 a1 = new Al75();

        int[] array = {149, 180, 192, 170};


        System.out.println(a1.solution(array,167));

    }

    public int solution(int[] array, int height) {
        int answer = 0;

        Arrays.sort(array);

        for (int i : array) {
            if(i > height) {
                answer++;
            }
        }

        return answer;
    }

    public int solution2(int[] array, int height) {

        return (int) Arrays.stream(array).sorted().filter((i) -> i > height).count();
    }

}
