class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        
        for(int i = 0 ; i < s.length() ; i++) {
            String trimStr = s.substring(0, i);
            answer[i] = trimStr.lastIndexOf(s.substring(i, i+1));
            answer[i] = answer[i] == -1 ? -1 : i - answer[i];
        }
        
        return answer;
    }
}