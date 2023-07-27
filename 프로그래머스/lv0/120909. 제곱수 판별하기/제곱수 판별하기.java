import java.util.stream.*;

class Solution {
    public int solution(int n) {
        return IntStream.range(1 , n+1).boxed().filter(num -> num*num == n)
            .toArray().length > 0 ? 1 : 2 ;         
    }
}