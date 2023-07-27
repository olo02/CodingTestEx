import java.util.Arrays;

class Solution {
    public int solution(String my_string) {
        return Arrays.stream(my_string.replace("- ", "-").replace("+ ", "").split(" "))
                .map(Integer::parseInt).reduce(Integer::sum).get();
        
    }
}