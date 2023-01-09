package Al;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class Al6 {
    public static void main(String[] args) throws ScriptException {
        Al6 a1 = new Al6();
        int[] arr = {4, 5, 6, 7, 8, 9, 10, 11, 12};

        int[] solution = a1.solution(3, arr);
        for (int i : solution) {
            System.out.println(i);
        }

    }
    public int[] solution(int n, int[] numlist) {
        int[] arry = new int[numlist.length];
        int count = 0;
        for(int i = 0; i<numlist.length; i++){
            if( numlist[i]%n == 0){
                arry[count] = numlist[i];
                count++;
            }
        }

        int[] answer = new int[count];
        for(int i = 0; i<count; i++){
            answer[i] = arry[i];
        }

        return answer;
    }

    // return Arrays.stream(numList).filter(value -> value % n == 0).toArray();
}
