package Al;

public class Al36 {
    public static void main(String[] args) {

        // 문자열 "hello"에서 각 문자를 오른쪽으로 한 칸씩 밀고 마지막 문자는 맨 앞으로 이동시키면 "ohell"이 됩니다.
        // 이것을 문자열을 민다고 정의한다면 문자열 A와 B가 매개변수로 주어질 때, A를 밀어서 B가 될 수 있다면 밀어야 하는
        // 최소 횟수를 return하고 밀어서 B가 될 수 없으면 -1을 return 하도록 solution 함수를 완성해보세요.

        Al36 p = new Al36();
        String A = "atat", B = "tata";

        System.out.println(p.solution2(A, B));

    }


    // 중복 문자를 고려안해서 하나 실패
    public int solution(String A, String B) {
        int answer = 0;

        if(A.equals(B)) return answer;

        char[] chars = A.toCharArray();

        char tmp = chars[chars.length-1];

        String replaceA = A.replace(String.valueOf(tmp),"");

        String compareA = String.valueOf(tmp);

        compareA += replaceA;

        if(compareA.equals(B)) {
            answer = 1;
        } else {
            answer = -1;
        }

        return answer;
    }

    // 테스트 4개는 맞는데 출력하면 틀림 왜지!?
    public int solution2(String A, String B) {
        int answer = 0;

        if(A.equals(B)) return answer;

        char[] chars = A.toCharArray();

        StringBuilder compareStr = new StringBuilder(String.valueOf(chars[chars.length - 1]));

        System.out.println("compareStr: " +compareStr);

        for (int i = 0; i < chars.length-1; i++) {
            compareStr.append(chars[i]);
        }

        System.out.println(compareStr);


        if(compareStr.toString().equals(B)) {
            answer = 1;
        } else {
            answer = -1;
        }

        return answer;
    }

    public int solution3(String A, String B) {
        int answer = 0;
        String copy = A;

        for (int i = 0; i < A.length(); i++) {
            if (copy.equals(B)) {
                return answer;
            }

            String a = copy.substring(copy.length() - 1);
            copy = a + copy.substring(0, copy.length() - 1);
            answer++;
        }

        return -1;
    }


}
