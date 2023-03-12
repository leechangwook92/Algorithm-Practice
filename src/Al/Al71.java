package Al;


public class Al71 {
    public static void main(String[] args) {

        //  정수 num과 k가 매개변수로 주어질 때,
        //  num을 이루는 숫자 중에 k가 있으면 num의 그 숫자가 있는 자리 수를 return하고 없으면 -1을 return 하도록 solution 함수를 완성해보세요.

        Al71 a = new Al71();

        System.out.println(a.solution(29183,1));
    }


    public int solution(int num, int k) {
        String numS = Integer.toString(num);
        String sK = Integer.toString(k);

        if(numS.indexOf(sK) == -1) {
            return  -1;
        } else {
            return numS.indexOf(sK)+1;
        }
    }

}
