import java.util.*;

class Solution {
    public int solution(String my_string) {
        
        int result = 0;
        char[] arr = my_string.toCharArray();
        
        for(char ch : arr){
            if(ch >= '0' && ch <= '9'){
                result += Character.getNumericValue(ch);
            }    
        }
        
        return result;   
    }
}