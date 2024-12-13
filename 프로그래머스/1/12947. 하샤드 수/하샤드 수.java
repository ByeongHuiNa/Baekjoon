import java.util.*;
class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        String s = String.valueOf(x);
        String sa[] = s.split("");
        int total = 0;
        
        for(int i=0; i<sa.length; i++){
            total += Integer.parseInt(sa[i]);
        }
        if(x%total != 0){
            answer = false;
        }
        return answer;
    }
}