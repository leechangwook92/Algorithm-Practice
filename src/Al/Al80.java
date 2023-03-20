package Al;

public class Al80 {
    public static void main(String[] args) {

        // 문자열 my_string이 매개변수로 주어집니다. my_string은 소문자, 대문자, 자연수로만 구성되어있습니다.
        // my_string안의 자연수들의 합을 return하도록 solution 함수를 완성해주세요.

        Al80 a1 = new Al80();

        System.out.println(a1.solution("aAb1B2cC34oOp"));

    }

    public int solution(String my_string) {
        int answer = 0;
        String[] s = my_string.split("[a-z,A-Z]");
        for (String s1 : s) {
            if(s1.equals("")) continue;
            answer += Integer.valueOf(s1);
        }

        return answer;
    }

}
