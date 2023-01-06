package Al;


public class Al1 {
    public static void main(String[] args) {
        Al1 a1 = new Al1();
        Al1 a2 = new Al1();
        System.out.println(a1.solution("3people unFollowed me"));
        System.out.println(a2.solution("for the last week"));
    }

    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        String[] split = s.split("");
        int count = 0;

        for (String s1 : split) {
            if(s1.equals(" ")) {
                count = 0;
                answer.append(" ");
            } else if (count == 0) {
                count += 1;
                answer.append(s1.toUpperCase());
            } else {
                answer.append(s1.toLowerCase());
            }
        }

        return answer.toString();
    }

}
