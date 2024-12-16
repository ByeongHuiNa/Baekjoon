class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int check[] = new int[10];
        
        for(int n : numbers){
            check[n] = 1;
        }
        
        for(int i=0; i<check.length; i++){
            if(check[i] == 0)
                answer+=i;
        }
        return answer;
    }
}