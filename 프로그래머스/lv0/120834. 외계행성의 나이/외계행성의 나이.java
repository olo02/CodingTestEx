import java.util.Arrays;
import java.util.stream.Collectors;

class Solution {
    public String solution(int age) {
        return Arrays.stream(String.valueOf(age).split(""))
                .map(str -> (char)(str.charAt(0) + 49))
                .map(String::valueOf)
                .collect(Collectors.joining());
    }
}