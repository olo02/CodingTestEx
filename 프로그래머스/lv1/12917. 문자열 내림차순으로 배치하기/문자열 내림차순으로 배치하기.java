import java.util.stream.Collectors;
import java.util.Comparator;

class Solution {
    public String solution(String s) {
        return s.chars().mapToObj(Character::toString).sorted(Comparator.reverseOrder())
            .collect(Collectors.joining());
    }
}