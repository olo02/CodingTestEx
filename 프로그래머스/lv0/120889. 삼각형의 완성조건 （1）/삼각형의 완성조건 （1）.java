import java.util.stream.IntStream;

class Solution {
    public int solution(int[] sides) {
        
        int max = IntStream.of(sides).max().getAsInt();
        int sum = IntStream.of(sides).sum();
        
        return max < sum - max ? 1 : 2;
        
    }
}