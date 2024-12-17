class Solution {
    public int solution(String[][] board, int h, int w) {
        int n = board.length;  // 보드의 크기 (정사각형 크기)
        int count = 0;  // 같은 색으로 색칠된 칸의 개수

        // 방향을 나타내는 dh, dw (상, 우, 하, 좌)
        int[] dh = {-1, 0, 1, 0};  // 상, 우, 하, 좌 방향
        int[] dw = {0, 1, 0, -1};  // 상, 우, 하, 좌 방향

        // board[h][w]의 색과 비교할 색깔
        String color = board[h][w];

        // 4방향으로 이동하면서 같은 색의 칸을 확인
        for (int i = 0; i < 4; i++) {
            int h_check = h + dh[i];  // h + dh[i] (상, 우, 하, 좌)
            int w_check = w + dw[i];  // w + dw[i] (상, 우, 하, 좌)

            // 보드의 범위를 벗어나지 않으면
            if (h_check >= 0 && h_check < n && w_check >= 0 && w_check < n) {
                // 색이 동일하면 count 증가
                if (board[h][w].equals(board[h_check][w_check])) {
                    count++;
                }
            }
        }

        return count;  // 같은 색의 칸의 개수 반환
    }
}
