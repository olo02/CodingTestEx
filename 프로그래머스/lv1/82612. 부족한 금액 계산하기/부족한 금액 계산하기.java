import java.util.stream.LongStream;
class Solution {
    public long solution(int price, int money, int count) {
        long answer = -1;
        answer *= money - (long) price * count * (count+1) / 2;
        return answer <= 0 ? 0 : answer;
    }
}