import java.util.stream.IntStream;

class Solution {
    public double solution(int[] arr) {
        return IntStream.of(arr).sum() / (double) arr.length;
    }
}