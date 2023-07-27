import java.util.*;

class Solution {
    public String solution(String cipher, int code) {
        StringBuilder sb = new StringBuilder();
        
        char[] arr = cipher.toCharArray();
        for(int i = 0 ; i < arr.length ; i++) {
            if((i+1) % code == 0){
                sb.append(String.valueOf(arr[i]));
            }
        }
        
        return sb.toString();
    }
}