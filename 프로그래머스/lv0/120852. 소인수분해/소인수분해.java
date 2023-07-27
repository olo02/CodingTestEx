import java.util.stream.IntStream;

class Solution {
    public int[] solution(int n) {
        return IntStream.rangeClosed(2, n)
            .filter(num -> n % num == 0 && IntStream.rangeClosed(2, num)
                    .filter(num2 -> num % num2 == 0).count() == 1)
            .toArray();
    }
}