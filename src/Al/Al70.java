package Al;


public class Al70 {
    public static void main(String[] args) {

        //두 배열이 얼마나 유사한지 확인해보려고 합니다. 문자열 배열 s1과 s2가 주어질 때 같은 원소의 개수를 return하도록 solution 함수를 완성해주세요.

        Al70 a = new Al70();
        String[] arr1 = {"a", "b", "c"};
        String[] arr2 = {"com", "b", "d", "p", "c"};

        System.out.println(a.solution(arr1, arr2));
    }


    public int solution(String[] s1, String[] s2) {
        int count = 0;
        for (String s : s1) {
            for (String ss : s2) {
                if (ss.equals(s)) count++;
            }
        }
        return count;
    }

}
