import java.util.Arrays;
import java.util.stream.Collectors;

class Solution {
    public String solution(String s) {
        return Arrays.stream(s.split(""))
            .filter(str -> Arrays.stream(s.split("")).filter(str2 -> str2.equals(str)).count() == 1)
            .sorted().collect(Collectors.joining());
    }
}