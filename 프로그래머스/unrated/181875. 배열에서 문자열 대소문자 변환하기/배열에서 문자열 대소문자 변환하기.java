class Solution {
    public String[] solution(String[] strArr) {
        int index = 0;
        String[] answer = new String[strArr.length];
        
        for(String str : strArr) {
            if(index % 2 == 0) {
                answer[index] = str.toLowerCase();
            } else {
                answer[index] = str.toUpperCase();
            }
            index++;
        }    
        
        return answer;
    }
}