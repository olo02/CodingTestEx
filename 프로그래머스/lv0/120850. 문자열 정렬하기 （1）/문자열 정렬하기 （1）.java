import java.util.Arrays;

class Solution {
    public int[] solution(String my_string) {
        return Arrays.stream(my_string.split(""))
                .filter(str -> str.charAt(0) >= '0' && str.charAt(0) <= '9').sorted()
                .mapToInt(Integer::parseInt).toArray();
    }
}