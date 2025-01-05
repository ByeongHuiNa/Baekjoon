class Solution {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        String[] arr = s.split(" ", -1); // 공백 유지

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length(); j++) {
                if (j % 2 == 0) {
                    answer.append(Character.toUpperCase(arr[i].charAt(j)));
                } else {
                    answer.append(Character.toLowerCase(arr[i].charAt(j)));
                }
            }
            if (i < arr.length - 1) {
                answer.append(" "); // 단어 간 공백 추가
            }
        }

        return answer.toString();
    }
}
