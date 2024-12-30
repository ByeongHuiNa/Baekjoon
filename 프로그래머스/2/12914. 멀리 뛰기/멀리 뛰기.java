class Solution {
    public long solution(int n) {
        long[] dp = new long[2001];
        
        // 초기 값 설정
        dp[1] = 1;
        dp[2] = 2;
        
        // dp 배열 채우기
        for (int i = 3; i < 2001; i++) {
            dp[i] = (dp[i - 2] + dp[i - 1]) % 1234567;
        }
        
        // 결과 반환
        return dp[n];
    }
}
