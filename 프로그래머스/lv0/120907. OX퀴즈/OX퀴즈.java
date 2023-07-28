import java.util.Arrays;

class Solution {
    public String[] solution(String[] quiz) {
        return Arrays.stream(quiz).map(i -> i.split(" "))
            .map(i -> Integer.parseInt(i[0]) + Integer.parseInt(i[2]) 
                 * (i[1].equals("+") ? 1 : -1) == 
                 Integer.parseInt(i[4]) ? "O" : "X")
            .toArray(String[]::new);
        
    }
}