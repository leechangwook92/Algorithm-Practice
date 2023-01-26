package Al;

public class Al21 {
    public static void main(String[] args) {

        // 1부터 13까지의 수에서, 1은 1, 10, 11, 12, 13 이렇게 총 6번 등장합니다.
        // 정수 i, j, k가 매개변수로 주어질 때, i부터 j까지 k가 몇 번 등장하는지 return 하도록 solution 함수를 완성해주세요.

        Al21 a1 = new Al21();
        int solution = a1.solution(1, 13, 6);
        System.out.println(solution);

    }

    public int sou(int i, int j, int k ) {

        int answer = 0;

        for (int l = i ; l <= j; l++) {
            String s = String.valueOf(l);

            String[] split = s.split("");

            for(int z = 0; z < split.length; z++) {
                if(Integer.parseInt(split[z]) == k) {
                    answer++;
                }
            }
        }

        return answer;
    }


    // 실패작 split.length를 고려하지않음..
    public int solution(int i, int j, int k) {
        int answer = 0;

        for (int l = i ; l <= j; l++) {
            String s = String.valueOf(l);

            String[] split = s.split("");

            if(split.length == 1) {
                if(Integer.parseInt(split[0]) == k) {
                    answer++;
                }
            } else {
                if (Integer.parseInt(split[0]) == k && Integer.parseInt(split[1]) == k) {
                    answer += 2;
                }

                else if(Integer.parseInt(split[0]) == k || Integer.parseInt(split[1]) == k) {
                    answer++;
                }
            }
        }
        return answer;
    }

}
