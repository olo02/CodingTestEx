class Solution {
    public String solution(int a, int b) {
        String[] days = {"SUN","MON","TUE","WED","THU","FRI","SAT"};
        int[] months = {31,29,31,30,31,30,31,31,30,31,30,31};
        
        for(int i = 1 ; i < a ; i++) {
            b += months[i-1];
        }
        
        return days[(b + 4) % 7];
    }
}