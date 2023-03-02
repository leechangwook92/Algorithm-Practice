package Al;

public class Al51 {
    public static void main(String[] args) {

        // 머쓱이는 구슬을 친구들에게 나누어주려고 합니다. 구슬은 모두 다르게 생겼습니다.
        // 머쓱이가 갖고 있는 구슬의 개수 balls와 친구들에게 나누어 줄 구슬 개수 share이 매개변수로 주어질 때,
        // balls개의 구슬 중 share개의 구슬을 고르는 가능한 모든 경우의 수를 return 하는 solution 함수를 완성해주세요.

        Al51 a = new Al51();

        System.out.println(a.solution2(5, 3));

    }

    public int solution(int balls, int share) {
        return combination(balls, share);
    }

    public static int combination(int balls, int share) {
        if (balls == share || share == 0) return 1;
        return combination((balls - 1), (share - 1)) + combination(balls - 1, share);
    }

    public int solution2(int balls, int share) {

        int answer;

        int left = 1;
        int right = 1;
        int up = 1;

        if(balls == share) {
            return 1;
        }

        for(int i = 1; i <= balls-share; i++) {
            left *= i;
        }

        for(int i = 1; i <= share; i++) {
            right *= i;
        }

        for(int i = 1; i <= balls; i++) {
            up *= i;
        }

        answer = up / (left*right);

        return answer;

    }



}
