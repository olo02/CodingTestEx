import java.util.stream.IntStream;
import java.util.Arrays;
    
class Solution {
    public int solution(int[] sides) {
        Arrays.sort(sides);
        return sides[0]*2-1;
    }
}