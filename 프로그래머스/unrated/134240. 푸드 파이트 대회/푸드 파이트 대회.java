import java.util.stream.*;

class Solution {
    public String solution(int[] food) {
        StringBuilder dishes = new StringBuilder();
        StringBuilder answer = new StringBuilder();
        
        for(int i = 1 ; i < food.length ; i++) {
            if(food[i] / 2 > 0) {
                for(int j = 0 ; j < food[i]/2 ; j++) {
                    dishes.append(i);
                }
            }
        }
        
        answer.append(dishes);
        answer.append(0);
        answer.append(dishes.reverse());
        
        return answer.toString();
    }
}