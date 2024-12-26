import java.util.*;
class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> st = new Stack<>();
        
        for (int move : moves) { // moves 배열 순회
            for (int j = 0; j < board.length; j++) {
                int where = board[j][move - 1]; // 해당 열에서 위에서부터 확인
                
                if (where == 0) continue; // 비어 있으면 다음 줄로
                
                board[j][move - 1] = 0; // 인형을 꺼냄
                
                if (!st.isEmpty() && st.peek() == where) { 
                    st.pop(); // 이전 인형과 동일하면 제거
                    answer += 2; // 점수 추가
                } else {
                    st.push(where); // 스택에 추가
                }
                break; // 이 열에서 인형을 꺼냈으므로 다음 move로
            }
        }
        return answer;
    }
}
