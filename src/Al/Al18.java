package Al;

import java.util.ArrayList;

public class Al18 {
    public static void main(String[] args) {

        // 양의 정수 x가 하샤드 수이려면 x의 자릿수의 합으로 x가 나누어져야 합니다.
        // 예를 들어 18의 자릿수 합은 1+8=9이고, 18은 9로 나누어 떨어지므로 18은 하샤드 수입니다.
        // 자연수 x를 입력받아 x가 하샤드 수인지 아닌지 검사하는 함수, solution을 완성해주세요.

        Al18 a1 = new Al18();

        boolean solution = a1.solution(10);
        System.out.println(solution);

    }

    public boolean solution(int x) {
        boolean answer = true;
        int xSum = 0;
        String[] xS = new String[1];
        xS[0] = String.valueOf(x);
        // 정수값 받아서 새 스트링 배열에 넣기

        ArrayList<String> arrayList = new ArrayList<String>();
        String[] xSList= xS[0].split("");
        // 넣고 쪼개서

        for (int i= 0; i<xSList.length; i++) {
            arrayList.add(xSList[i]);
        }
        for (String s : arrayList) {
            xSum += Integer.parseInt(s);
        }

        int divideValue = x/xSum;

        while (answer) {
            divideValue = x/xSum;
            if(x% xSum == 0) {
                answer = true;
                break;
            } else{
                answer = false;
                break;
            }
        }

        return answer;
    }

}
