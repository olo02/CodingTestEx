import java.util.*;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        List<String> nameList = Arrays.asList(name);
        
        for(int n = 0 ; n < photo.length ; n++ ) {
            answer[n] = Arrays.stream(photo[n])
                .mapToInt(i -> nameList.contains(i) ? yearning[nameList.indexOf(i)] : 0).sum();
        }
        
        return answer;
    }
}