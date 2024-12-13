import java.util.*;
class Solution {
    boolean solution(String s) {
        boolean answer = true;
        char[] list = s.toCharArray();
        int pCount=0, yCount = 0;
        
        for(char a : list){
            if(a =='p' || a =='P'){
                pCount++;
            }else if(a =='y' || a =='Y'){
                yCount++;
            }
        }
       

        return pCount==yCount;
    }
}