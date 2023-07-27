import java.util.Arrays;
    
class Solution {
    public int solution(String[] spell, String[] dic) {
        return Arrays.stream(dic).filter(str -> (int) Arrays.stream(spell)
                               .filter(spl -> str.contains(spl)).count() == spell.length)
            .count() > 0 ? 1 : 2;
    }
}