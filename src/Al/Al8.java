package Al;

public class Al8 {
    public static void main(String[] args) {
        Al8 a1 = new Al8();
        int[] arr = {1, 2, 3, 4, 5};
        int[] sol = a1.solution(arr);
        for (int i : sol) {
            System.out.println(i);
        }

    }
    public int[] solution(int[] array) {
        int[] answer = new int[2];
        int maxNum = 0;
        int index = 0;

        for (int i = 0; i < array.length; i++) {
            if(array[i] > maxNum) {
                maxNum = array[i];
                index = i;
            }
        }

        answer[0] = maxNum;
        answer[1] = index;

        return answer;
    }

}
