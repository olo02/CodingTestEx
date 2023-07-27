import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public String solution(String letter) {
        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        
        return Arrays.stream(letter.split(" "))
            .map(code -> String.valueOf((char)(Arrays.asList(morse).indexOf(code) + 97)))
            .collect(Collectors.joining());
    }
}