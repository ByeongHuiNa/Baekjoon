class Solution {
    public long solution(long price, long money, long count) {
        long answer = 0;
        long total = 0;
        for(int i=1; i<=count; i++){
            total += price * i;
        }
        if(money>=total){
            return 0;
        }
        answer = Math.abs(money - total);
        return answer;
    }
}