package Al;

import java.util.Arrays;

public class Al65 {
    public static void main(String[] args) {

        // 선분 세 개로 삼각형을 만들기 위해서는 다음과 같은 조건을 만족해야 합니다.
        // 가장 긴 변의 길이는 다른 두 변의 길이의 합보다 작아야 합니다.
        // 삼각형의 세 변의 길이가 담긴 배열 sides이 매개변수로 주어집니다.
        // 세 변으로 삼각형을 만들 수 있다면 1, 만들 수 없다면 2를 return하도록 solution 함수를 완성해주세요.

        Al65 a = new Al65();
        int[] arr = {1, 2, 3};

        System.out.println(a.solution(arr));
    }

    public int solution(int[] sides) {
        Arrays.sort(sides);

        int x = sides[0];
        int y = sides[1];
        int z = sides[2];

        if(z < x+y) {
            return 1;
        } else {
            return 2;
        }
    }

}
