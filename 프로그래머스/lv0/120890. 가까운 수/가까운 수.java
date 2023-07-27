import java.util.stream.IntStream;

class Solution {
    public int solution(int[] array, int n) {
        return IntStream.of(array).map(num -> num - n)
            .reduce((a, b) -> Math.abs(a) > Math.abs(b) ? b 
                    : Math.abs(a) == Math.abs(b) ? Math.min(a,b) 
                    : a).getAsInt() + n;
    }
}