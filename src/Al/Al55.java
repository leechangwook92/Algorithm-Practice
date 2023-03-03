package Al;

public class Al55 {
    public static void main(String[] args) {

        // 머쓱이는 친구들과 동그랗게 서서 공 던지기 게임을 하고 있습니다.
        // 공은 1번부터 던지며 오른쪽으로 한 명을 건너뛰고 그다음 사람에게만 던질 수 있습니다.
        // 친구들의 번호가 들어있는 정수 배열 numbers와 정수 K가 주어질 때,
        // k번째로 공을 던지는 사람의 번호는 무엇인지 return 하도록 solution 함수를 완성해보세요.

        Al55 a = new Al55();
        int[] arr = {1, 2, 3, 4};

        System.out.println(a.solution(arr,2));
    }

    public int solution(int[] numbers, int k) {
        // 3~99 1~999

        int answer = 0;
        int index = 0;

        for(int i=1; i<k; i++) {
            index += 2;
        }

        index %= numbers.length;
        answer = numbers[index];

        return answer;
    }

}
