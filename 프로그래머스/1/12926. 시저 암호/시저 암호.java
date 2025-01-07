class Solution {
    public String solution(String s, int n) {
        StringBuilder answer = new StringBuilder(); // StringBuilder 사용
        char[] arr = s.toCharArray(); // 문자열을 문자 배열로 변환
        
        for (char c : arr) {
            if (c >= 'A' && c <= 'Z') { // 대문자 범위
                answer.append((char) ((c - 'A' + n) % 26 + 'A'));
            } else if (c >= 'a' && c <= 'z') { // 소문자 범위
                answer.append((char) ((c - 'a' + n) % 26 + 'a'));
            } else { // 공백 처리
                answer.append(c);
            }
        }
        
        return answer.toString(); // StringBuilder를 문자열로 변환하여 반환
    }
}
