import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        Set<Integer> sums = new HashSet<>(); // 중복을 제거하기 위한 Set

        // 서로 다른 두 숫자를 뽑아 합 계산
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                sums.add(numbers[i] + numbers[j]);
            }
        }

        // Set을 List로 변환 후 정렬
        List<Integer> sortedSums = new ArrayList<>(sums);
        Collections.sort(sortedSums);

        // List를 배열로 변환하여 반환
        return sortedSums.stream().mapToInt(Integer::intValue).toArray();
    }
}
