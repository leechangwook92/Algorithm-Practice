package Al;
import java.util.ArrayList;
import java.util.Scanner;

public class Al26 {
    public static void main(String[] args) {

        // 설명

        Al26 al = new Al26();

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String[] arr = new String[num];
        for(int i=0; i<num; i++) {
            arr[i] = sc.next();
        }

        for(String x: al.solution(num, arr)){
            System.out.println(x);
        }

    }

    public ArrayList<String> solution(int n, String[] strArr) {

        ArrayList<String> arr = new ArrayList<>();
        for(String x : strArr) {
            char[] chars = x.toCharArray();

            int lt = 0, rt = x.length()-1;

            while (lt < rt) {
                char tmp = chars[lt];
                chars[lt] = chars[rt];
                chars[rt] = tmp;
                lt++;
                rt--;
            }

            String tmp = String.valueOf(chars);
            arr.add(tmp);

        }

        return arr;
    }

}
