import java.util.Arrays;

class Solution {
    boolean solution(String s) {
        return Arrays.stream(s.toLowerCase().split("")).mapToInt(i -> i.equals("p") ? 1 : i.equals("y") ? -1 : 0).sum() == 0 ? true : false;
    }
}