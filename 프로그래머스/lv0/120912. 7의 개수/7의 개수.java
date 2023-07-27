import java.util.stream.IntStream;
import java.util.Arrays;

class Solution {
    public int solution(int[] array) {
        return IntStream.of(array).map(num -> (int) Arrays.stream(String.valueOf(num).split(""))
                                .filter(num2 -> 7 == Integer.parseInt(num2)).count()).sum();
    }
}