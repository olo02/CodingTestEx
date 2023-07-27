import java.util.Arrays;

class Solution {
    public int solution(String s) {
        int answer = 0;
        String[] strs = s.split(" ");
        
        for(int i = 0 ; i < strs.length ; i++){
            if(strs[i].equals("Z")){
                answer -= Double.parseDouble(strs[i-1]);
            } else {
                answer += Double.parseDouble(strs[i]);
            }
        }
        return answer;
    }
}