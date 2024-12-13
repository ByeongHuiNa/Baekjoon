import java.util.*;
class Solution {
    public int[] solution(long n) {
        
        
        String s = String.valueOf(n);
        int[] answer = new int[s.length()];
        char c [] = s.toCharArray();
        int i=s.length()-1;
        for(char a : c){
            answer[i] = a-'0'; 
            i--;
        }
        

        return answer;
    }
}