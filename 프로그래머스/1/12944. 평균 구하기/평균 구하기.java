class Solution {
    public double solution(int[] arr) {
        double answer = 0;
        double total = 0;
        for(int a : arr){
            total += a;
        }
        return total/arr.length;
    }
}