import java.util.Arrays;

class Solution {
    public int solution(int[][] dots) {
        return Math.abs(Arrays.stream(dots).mapToInt(i -> i[0]).distinct()
                        .reduce((a,b) -> a-b).getAsInt()) 
            * Math.abs(Arrays.stream(dots).mapToInt(i -> i[1]).distinct()
                       .reduce((a,b) -> a-b).getAsInt());
    }
}