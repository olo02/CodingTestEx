class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for(int i = 1 ; i <= n ; i *=10) {
            answer += (int) ((n % (i*10)) * 1 / i) ;
        }
        return answer;
    }
}