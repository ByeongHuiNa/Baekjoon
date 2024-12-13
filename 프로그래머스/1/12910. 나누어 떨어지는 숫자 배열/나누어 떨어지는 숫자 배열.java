import java.util.*;
class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = {};
        List<Integer> list = new ArrayList<>();
        Arrays.sort(arr);
        for(int a : arr){
            if(a%divisor == 0){
                list.add(a);
            }
                
        }
        if(list.isEmpty())
            list.add(-1);
        answer = list.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}