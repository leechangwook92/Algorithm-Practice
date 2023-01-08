package Al;


public class Al3 {
    public static void main(String[] args) {
        Al3 a1 = new Al3();

        int[] solution = a1.solution(12345);
        for (int i : solution) {
            System.out.println(i);
        }

    }

//    public int[] solution(long n) {
//        String[] arr = String.valueOf(n).split("");
//        int[] answer = new int[arr.length];
//
//        for(int i=0, j=answer.length-1; i<answer.length; i++, j--) {
//            answer[i] = Integer.valueOf(arr[j]);
//        }
//        return answer;
//    }
    public int[] solution(long n) {
        return new StringBuilder().append(n).reverse().chars().map(Character::getNumericValue).toArray();
    }

}
