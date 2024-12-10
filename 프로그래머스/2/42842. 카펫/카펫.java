class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int total = brown + yellow;
        
        for(int i=3; i<total; i++){
            int width = total/i; 
            if(width>=i){
                 if ((i - 2) * (width - 2) == yellow) {
                answer[0] = width;
                answer[1] = i;
                break;
                }
            }
        }
        return answer;
    }
}