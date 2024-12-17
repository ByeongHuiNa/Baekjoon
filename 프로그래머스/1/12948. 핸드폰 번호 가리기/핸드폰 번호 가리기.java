class Solution {
    public String solution(String phone_number) {
        String answer = "";
        
        String arr[] = phone_number.split("");
        int length = arr.length-4;
        for(int i=0; i<length; i++){
            arr[i] = "*";
        }
        answer = String.join("", arr);
        return answer;
    }
}