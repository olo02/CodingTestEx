import java.util.stream.IntStream;
import java.util.Arrays;

class Solution {
    public int solution(int i, int j, int k) {
        return IntStream.rangeClosed(i,j)
            .map(num -> (int) Arrays.stream(String.valueOf(num).split(""))
                    .filter(num2 -> num2.equals(String.valueOf(k))).count()).sum();
    }
}