class Solution {
    public int[] solution(int[] num_list) {
        int evenNum = 0;
        int oddNum = 0;
        
        for(int number : num_list) {
           if(number % 2 == 0) {
              evenNum++;                  
           } else {
               oddNum++;
           }      
        }
        
        int[] answer = {evenNum, oddNum};

        
        return answer;
    }
}