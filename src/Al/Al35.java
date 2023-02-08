package Al;

public class Al35 {
    public static void main(String[] args) {

        // 문자열 str1, str2가 매개변수로 주어집니다. str1 안에 str2가 있다면 1을 없다면 2를 return하도록 solution 함수를 완성해주세요.

        Al35 al = new Al35();

        System.out.println(al.solution(1234));
    }

    public int solution(int n) {
        int answer = 0;
        String str = String.valueOf(n);
        String[] split = str.split("");
        for (String s : split) {
            answer += Integer.parseInt(s);
        }

        return answer;
    }

}
