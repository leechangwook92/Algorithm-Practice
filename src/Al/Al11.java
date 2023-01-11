package Al;


import java.util.*;

public class Al11 {
    public static void main(String[] args) {

//        최빈값은 주어진 값 중에서 가장 자주 나오는 값을 의미합니다.
//        정수 배열 array가 매개변수로 주어질 때, 최빈값을 return 하도록 solution 함수를 완성해보세요.
//        최빈값이 여러 개면 -1을 return 합니다

        Al11 a1 = new Al11();
        int[] arr = {1, 2, 3, 3, 3, 4};

        long solution = a1.solution2(arr);

        System.out.println(solution);

    }

    public int solution(int[] array) {
        int result=0;
        int arrayMax=0;
        for(int i=0; i<array.length; i++) {     //매개변수로 들어온 배열의 최대값을 구함
            if(array[i]>arrayMax) {
                arrayMax=array[i];
            }
        }

        int[] count=new int[arrayMax+1];        //크기가 최대값+1 인 배열을 하나 생성

        for(int j=0; j<array.length; j++) {        //매개변수 배열에 들어있는 정수번째마다
            count[array[j]]++;                    //새로 만든 배열에 1을 더해줌
        }

        int countMax=0;
        for(int m=0; m<count.length; m++) {     //새로만든 배열의 최대값을 구함
            if(count[m]>countMax) {
                countMax=count[m];              //새로만든 배열의 m번째 요소가 최대값이라면
                result=m;                       //매개변수로 들어온 배열의 m 이 최빈값
            }
        }

        int rep=0;
        for(int n=0; n<count.length; n++) {     //그 최대값이 중복으로 있는지를 확인
            if(countMax==count[n]) {            //중복이 없다면 rep는 1,
                rep++;                          //중복이 있다면 reo는 2이상
            }
        }

        if(rep!=1) {
            result=-1;
        }
        return result;
    }

    public int solution2(int[] array) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i <= Arrays.stream(array).max().getAsInt(); i++) {
            map.put(i, 0);
        }

        for (int i : array) {
            map.put(i, map.get(i) + 1);
        }

        ArrayList<Integer> arrayList = new ArrayList<>(map.values());

        for (Integer integer : arrayList) {
            System.out.println(integer+".");
        }

        int max = Collections.max(arrayList);

        System.out.println(arrayList.indexOf(max) +"---------"+ arrayList.lastIndexOf(max));

        if(arrayList.indexOf(max) != arrayList.lastIndexOf(max))
            return -1;

        return arrayList.indexOf(max);
    }

}
