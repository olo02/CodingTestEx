import java.util.Arrays;

class Solution {
    public int solution(String[] babbling) {
        return (int) Arrays.stream(babbling)
            .map(i -> replaceStr(i).replace(" ", ""))
            .filter(i -> i.length() == 0).count();
    }
    
    String replaceStr(String str) {
        String[] words = {"aya", "ye", "woo", "ma"};
        for(String word : words){
            str = str.replace(word, " ");
        }
        return str;
    }
}