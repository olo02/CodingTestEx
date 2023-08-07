import java.util.*;

class Solution {
    public String[] solution(String[] strings, int n) {
        String[] answer = new String[strings.length];
        Arrays.sort(strings);
        List<String> list = new ArrayList<>(Arrays.asList(strings));
        int index = 0;


        while(list.size() > 0) {
            answer[index] = reduce(list, n);
            index++;
        }
        
        return answer;
    }
    
    String reduce(List<String> list, int n) {
        String current = "";
        char min = Character.MAX_VALUE;
        for(String str : list) {
            if(str.charAt(n) < min) {
                min =  str.charAt(n);
                current = str;
            }
        }
        list.remove(current);
        return current;
    }
}