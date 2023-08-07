import java.util.Arrays;

class Solution {
    public int solution(int[] d, int budget) {
        Arrays.sort(d);
        int count = 0;
        for(int request : d) {
            budget -= request;
            if(budget < 0) break;
            count++;
        }
        return count;
    }
}