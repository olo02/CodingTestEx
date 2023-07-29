import java.util.stream.*;

class Solution {
    public int[] solution(int[] arr) {
        return arr.length == 1 ? new int[] {-1} 
            : IntStream.of(arr).filter(i -> i != IntStream.of(arr).min().getAsInt()).toArray();
    }
}