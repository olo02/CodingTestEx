import java.util.Arrays;

class Solution {
    boolean solution(String s) {
        return s.toLowerCase().chars()
            .map(i -> i == 'p' ? 1 : i == 'y' ? -1 : 0)
            .sum() == 0;        
    }
}