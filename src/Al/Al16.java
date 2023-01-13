package Al;


public class Al16 {
    public static void main(String[] args) {

        // 머쓱이는 추운 날에도 아이스 아메리카노만 마십니다. 아이스 아메리카노는 한잔에 5,500원입니다.
        // 머쓱이가 가지고 있는 돈 money가 매개변수로 주어질 때,
        // 머쓱이가 최대로 마실 수 있는 아메리카노의 잔 수와 남는 돈을 순서대로 담은 배열을 return 하도록 solution 함수를 완성해보세요.

        Al16 a1 = new Al16();

        int[] solution = a1.solution(5500);

        for (int i : solution) {
            System.out.println(i);
        }

    }

    public int[] solution(int money) {
        int[] answer = new int[2];
        int americano = 5500;

        answer[0] = money / americano;
        answer[1] = money % americano;

        return answer;
    }
}

