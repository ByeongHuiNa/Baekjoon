import java.util.*;
class Solution {
    public long solution(long n) {
        long answer = 0;
        String[] sa = Long.toString(n).split("");
        Arrays.sort(sa, Collections.reverseOrder());
        
        String answ = "";
        
        for(String s : sa){
             answ += s;
        }
        answer = Long.parseLong(answ);
          
        
        
        return answer;
    }
}