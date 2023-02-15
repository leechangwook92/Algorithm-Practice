package Al;

public class Al46 {
    public static void main(String[] args) {

        // 정수 배열 numbers와 정수 num1, num2가 매개변수로 주어질 때,
        // numbers의 num1번 째 인덱스부터 num2번째 인덱스까지 자른 정수 배열을 return 하도록 solution 함수를 완성해보세요.
        // 제한사항
        // 2 ≤ numbers의 길이 ≤ 30
        // 0 ≤ numbers의 원소 ≤ 1,000
        // 0 ≤num1 < num2 < numbers의 길이
        // numbers	        num1	num2	result
        // [1, 2, 3, 4, 5]	1	     3	   [2, 3, 4]
        // [1, 3, 5]	    1	     2	   [3, 5]


        Al46 a = new Al46();

        System.out.println(a.solution(23));

    }

    public String solution(int age) {
        StringBuilder answer = new StringBuilder();

        String[] split = String.valueOf(age).split("");

        for (int i = 0; i < split.length; i++) {

            if(Integer.parseInt(split[i]) == 0) {
                answer.append("a");
            } else if(Integer.parseInt(split[i]) == 1) {
                answer.append("b");
            } else if(Integer.parseInt(split[i]) == 2) {
                answer.append("c");
            } else if(Integer.parseInt(split[i]) == 3) {
                answer.append("d");
            } else if(Integer.parseInt(split[i]) == 4) {
                answer.append("e");
            } else if(Integer.parseInt(split[i]) == 5) {
                answer.append("f");
            } else if(Integer.parseInt(split[i]) == 6) {
                answer.append("g");
            } else if(Integer.parseInt(split[i]) == 7) {
                answer.append("h");
            } else if(Integer.parseInt(split[i]) == 8) {
                answer.append("i");
            } else if(Integer.parseInt(split[i]) == 9) {
                answer.append("j");
            }

        }


        return answer.toString();
    }

}
