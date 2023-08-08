import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        Set<Integer> result = new HashSet<>();
        
        for(int i = 0 ; i < numbers.length ; i++) {
            int sum = 0;
            for(int j = i+1 ; j < numbers.length ; j++) {
                sum = numbers[i] + numbers[j];
                result.add(sum);
            }
        }
        
        return Arrays.stream(result.toArray(new Integer[0])).mapToInt(i->i).sorted().toArray();
    }
}