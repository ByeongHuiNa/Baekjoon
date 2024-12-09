import java.util.*;

class Solution {
    public int solution(int n) {
        int nCount = Integer.bitCount(n); // 주어진 n의 2진수 1의 개수
        
        while (true) {
            n++; // n을 1 증가
            if (Integer.bitCount(n) == nCount) { // 1의 개수가 같으면 반환
                return n;
            }
        }
    }
}
