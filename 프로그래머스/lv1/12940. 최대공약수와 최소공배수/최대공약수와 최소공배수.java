import java.util.stream.IntStream;

class Solution {
    public int[] solution(int n, int m) {
        int measure = IntStream.rangeClosed(1, Math.min(n,m)).filter(i -> m % i == 0 && n % i == 0).max().getAsInt();
        
        return new int[] {measure, m*n/measure};
    }
}