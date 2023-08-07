import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int index = 0;
        
        for(int[] com : commands) {
            int length = com[1] - com[0] + 1;
            int[] result = new int[length];
            for(int j = 0 ; j < length ; j++) {
                result[j] = array[com[0] - 1 + j];
            }
            Arrays.sort(result);
            answer[index] = result[com[2] - 1];
            index++;
        }
        
        return answer;
    }
}