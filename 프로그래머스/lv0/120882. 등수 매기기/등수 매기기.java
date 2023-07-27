import java.util.Arrays;
import java.util.stream.IntStream;
    
class Solution {
    public int[] solution(int[][] score) {
        int[] sum = Arrays.stream(score)
            .map(i -> IntStream.of(i).sum()).mapToInt(i->i).toArray();
        
        return IntStream.of(sum).map(num -> (int) IntStream.of(sum)
                                     .filter(n -> num < n).count() + 1)
            .toArray();
    }
}