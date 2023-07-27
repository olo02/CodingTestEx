import java.util.stream.IntStream;

class Solution {
    public int solution(int n) {
        return IntStream.rangeClosed(1,n).filter(num -> IntStream.rangeClosed(1,num).filter(s -> num % s == 0).toArray().length >= 3).toArray().length;
    }
}