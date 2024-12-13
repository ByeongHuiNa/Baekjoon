class Solution {
    public long solution(long n) {
        long answer = -1;
        
        for(long l=1; l<=n; l++){
            if(l*l == n)
                return (l+1)*(l+1);
                
        }
        return answer;
    }
}