class Solution {
    public String solution(String[] seoul) {
        String answer = "김서방은 에 있다";
        int index = 0;
        StringBuffer sb = new StringBuffer();

        for(int i=0; i<seoul.length; i++){
            if(seoul[i].equals("Kim")){
                index = i;
                sb.append(answer);
                sb.insert(5, index);
            }
        }
       
        return sb.toString();
    }
}