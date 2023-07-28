import java.util.Arrays;
import java.util.Comparator;
class Solution {
    public int[] solution(int[] numlist, int n) {
        return Arrays.stream(numlist).boxed().sorted(Comparator.reverseOrder())
                .map(i -> new int[]{Math.abs(i - n), i})
                .sorted(Comparator.comparingInt(a -> a[0]))
                .mapToInt(i -> i[1])
                .toArray();
    }
}