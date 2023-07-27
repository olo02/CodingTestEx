import java.util.stream.IntStream;

class Solution {
    public int solution(int[] box, int n) {
        return IntStream.of(box).map(length -> length / n).reduce(1, (a,b) -> a*b);
    }
}