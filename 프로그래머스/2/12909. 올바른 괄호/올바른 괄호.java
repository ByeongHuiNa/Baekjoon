import java.util.*;

class Solution {
    boolean solution(String s) {
        Stack<Character> stack = new Stack<>();

        for (char a : s.toCharArray()) { // 문자열을 char 배열로 변환하여 순회
            if (a == '(') {
                stack.push(a);
            } else if (a == ')') {
                if (stack.isEmpty()) {
                    return false;
                }
                stack.pop();
            }
        }
        return stack.isEmpty(); // 스택이 비어 있어야 올바른 괄호입니다.
    }
}
