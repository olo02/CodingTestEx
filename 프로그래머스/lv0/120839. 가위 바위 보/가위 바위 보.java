import java.util.*;

class Solution {
    public String solution(String rsp) {
        String win = "";
        char[] arr = rsp.toCharArray();
        
        for(char value : arr){
            win += value == '2' ? "0"
                : value == '5' ? "2"
                : "5";
        }
        
        return win;
    }
}