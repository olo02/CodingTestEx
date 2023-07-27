import java.util.Arrays;
import java.util.stream.Collectors;

class Solution {
    public int solution(String my_string) {
        return Arrays.stream(my_string.replaceAll("[a-z|A-Z]", " ").split(" "))
            .filter(str -> str.length() > 0)
            .map(str -> Integer.parseInt(str))
            .reduce(0, Integer::sum);
    }
}