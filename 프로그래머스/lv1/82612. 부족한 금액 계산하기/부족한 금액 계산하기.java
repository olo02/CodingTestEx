import java.util.stream.LongStream;
class Solution {
    public long solution(int price, int money, int count) {
        long answer = (long) price * (LongStream.rangeClosed(1, count).sum());
        return money - answer >= 0 ? 0 : Math.abs(money - answer);
    }
}