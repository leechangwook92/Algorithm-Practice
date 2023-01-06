package Al;


public class Al2 {
    public static void main(String[] args) {
        Al2 a1 = new Al2();
        int[] arr = {1,2,3,4};
        a1.solution(arr);

    }

    public int solution(int[] common) {
        int answer = 0;
        if(common[2] - common[1] == common[1] - common[0]) {
            answer = common[common.length-1] + (common[1] - common[0]);
        } else {
            answer = common[common.length-1] * (common[1] / common[0]);
        }

        return answer;
    }

}
