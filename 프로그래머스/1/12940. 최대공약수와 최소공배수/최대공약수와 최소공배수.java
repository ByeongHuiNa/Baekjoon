import java.util.*;

class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        
        
        int small = Math.min(n, m);
        int big = Math.max(n,m);
       
        for(int i=1; i<=small; i++){
            if(big % i == 0 && small % i == 0)
                answer[0] = i;
            
        }
        answer[1] = n*m/answer[0];
        
                
        return answer;
    }
}