import java.util.stream.*;
import java.util.*;

class Solution {
    public int[] solution(int n, int[] numlist) {
        return IntStream.of(numlist).filter(num -> num % n == 0).toArray();
    }
}