class Solution {
    public int solution(int num) {
        int answer = -1;
        long longNum = (long) num;
        
        for(int i = 0; i < 500; i++){
            if(longNum == 1){
                answer = i;
                break;
            } else if (longNum % 2 == 0){
                longNum = longNum / 2L;
            } else {
                longNum = longNum * 3L + 1;
            }
        }
        
        return answer;
    }
}