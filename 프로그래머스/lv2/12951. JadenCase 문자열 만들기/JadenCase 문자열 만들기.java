import java.util.Arrays;
import java.util.stream.Collectors;

class Solution {
    public String solution(String s) {
        String str = s + ".";
        String answer = Arrays.stream(str.split(" "))
            .map(i -> i.length() == 0 ? " "
                 : i.substring(0,1).toUpperCase().concat(i.substring(1).toLowerCase() + " "))
            .collect(Collectors.joining());
        return answer.substring(0, answer.length()-2);
    }
}