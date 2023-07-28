import java.util.Arrays;

class Solution {
    public String solution(String polynomial) {
        int[] answer = new int[2];
        
        for(String str : polynomial.split(" \\+ ")){
            if(str.equals("x")){
                answer[0] += 1; 
            } else if(str.contains("x")) {
                answer[0] += Integer.parseInt(str.replace("x", ""));
            } else {
                answer[1] += Integer.parseInt(str);
            }
        }
        
        if(answer[0] == 0) {
            return answer[1] + "";
        } else if(answer[1] == 0) {
            return (answer[0] == 1 ? "" : answer[0]) + "x";
        }
        
        return (answer[0] == 1 ? "" : answer[0]) + "x + " + answer[1];
    }
}