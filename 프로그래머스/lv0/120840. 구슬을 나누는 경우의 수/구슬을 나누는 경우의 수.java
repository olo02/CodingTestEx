import java.util.stream.IntStream;
import java.math.BigInteger;

class Solution {
    public int solution(int balls, int share) {

        int answer;
        BigInteger reduce = IntStream.rangeClosed(share+1, balls)
            .mapToObj(BigInteger::valueOf)
            .reduce(BigInteger.ONE, BigInteger::multiply);
        BigInteger reduce2 = IntStream.rangeClosed(1, balls - share)
            .mapToObj(BigInteger::valueOf)
            .reduce(BigInteger.ONE, BigInteger::multiply);
        
        BigInteger divide = reduce.divide(reduce2);
        answer = divide.intValue();
        return answer;
    }
}