package Al;

public class Al38 {
    public static void main(String[] args) {

        // 문자열 my_string이 매개변수로 주어질 때, 대문자는 소문자로 소문자는 대문자로 변환한 문자열을 return하도록 solution 함수를 완성해주세요.

        Al38 p = new Al38();
        String A = "cccCCC";
        System.out.println(p.solution(A));

    }

    public String solution(String my_string) {
        String answer = "";

        for(char x : my_string.toCharArray()){
            if(x >= 65 && 90 >= x ) {
                answer += String.valueOf(x).toLowerCase();
            } else {
                answer += String.valueOf(x).toUpperCase();
            }
        }
        return answer;
    }

}
