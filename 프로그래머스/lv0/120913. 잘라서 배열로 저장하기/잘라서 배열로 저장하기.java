import java.util.*;

class Solution {
    public String[] solution(String my_str, int n) {
        List<String> answer = new ArrayList();
        int len = my_str.length();
        for(int i = 0 ; i < len ; i+=n) {
            answer.add(my_str.substring(i, n+i > len ? len : n+i));
        }
        return answer.toArray(new String[0]);
    }
}