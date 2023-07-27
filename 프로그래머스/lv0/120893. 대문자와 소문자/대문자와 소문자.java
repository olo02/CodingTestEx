import java.util.*;
import java.util.stream.*;

class Solution {
    public String solution(String my_string) {
        return Arrays.stream(my_string.split(""))
            .map(str -> Character.isUpperCase(str.charAt(0)) 
                 ? str.toLowerCase() 
                 : str.toUpperCase())
            .collect(Collectors.joining());
    }
}