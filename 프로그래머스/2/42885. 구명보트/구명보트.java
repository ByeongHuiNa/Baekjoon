import java.util.*;

class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        
        Arrays.sort(people); // 몸무게 정렬
        int i = 0; // 가장 가벼운 사람의 인덱스
        int max = people.length - 1; // 가장 무거운 사람의 인덱스
        
        while (i <= max) { // i와 max가 교차할 때 종료
            if (people[i] + people[max] <= limit) { 
                i++; // 가장 가벼운 사람 태움
            }
            max--; // 가장 무거운 사람 태움
            answer++; // 보트 1개 사용
        }
        
        return answer;
    }
}
