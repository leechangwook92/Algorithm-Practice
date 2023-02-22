package Al;

public class Al50 {
    public static void main(String[] args) {

        // 가위는 2 바위는 0 보는 5로 표현합니다.
        // 가위 바위 보를 내는 순서대로 나타낸 문자열 rsp가 매개변수로 주어질 때,
        // rsp에 저장된 가위 바위 보를 모두 이기는 경우를 순서대로 나타낸 문자열을 return하도록 solution 함수를 완성해보세요.

        Al50 a = new Al50();

        System.out.println(a.solution(".... . .-.. .-.. ---"));

    }

    public String solution(String rsp) {
        StringBuilder answer = new StringBuilder();

        String[] split = rsp.split("");

        for (String s : split) {
            if(s.contains("2")) {
                answer.append("0");
            } else if (s.contains("0")) {
                answer.append("5");
            } else if (s.contains("5")) {
                answer.append("2");
            }
        }

        return answer.toString();
    }


}
