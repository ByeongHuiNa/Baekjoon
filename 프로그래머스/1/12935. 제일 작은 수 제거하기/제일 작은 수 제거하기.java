import java.util.*;

class Solution {
    public List<Integer> solution(int[] arr) {
        
        int min = Integer.MAX_VALUE;
        List<Integer> answer = new ArrayList<Integer>();
        
       
        for(int i=0; i<arr.length; i++){
            if(min > arr[i])
                min = arr[i];
        }
        if(arr.length == 1){
            answer.add(-1);
        } else{
            for(int a : arr){
                if(a != min)
                    answer.add(a);
        }
            
        }
        
        
        
        
        return answer;
    }
}