import java.util.stream.IntStream;

class Solution {
    public int[] solution(int[] emergency) {
        return IntStream.of(emergency)
            .map(num -> (int) IntStream.of(emergency)
            .filter(compare -> compare > num).count() + 1)
            .toArray();
    }
}