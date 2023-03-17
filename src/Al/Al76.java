package Al;

public class Al76 {
    public static void main(String[] args) {

        // 머쓱이는 행운의 숫자 7을 가장 좋아합니다.
        // 정수 배열 array가 매개변수로 주어질 때, 7이 총 몇 개 있는지 return 하도록 solution 함수를 완성해보세요.

        Al76 a1 = new Al76();

        int[] array = {7, 77, 17};


        System.out.println(a1.solution(array));

    }

    public int solution(int[] array) {
        int answer = 0;
        StringBuilder strArr = new StringBuilder();

        for (int i : array) {
            strArr.append(String.valueOf(i));
        }

        String[] split = strArr.toString().split("");

        for (String s : split) {
            if(Integer.valueOf(s) == 7) {
                answer ++;
            }
        }

        return answer;
    }

}
