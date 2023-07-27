class Solution {
    public int solution(int[] numbers) {
        
        int result = 0;
        
        for(int i = 0 ; i < numbers.length ; i++) {
            for(int j = 0 ; j < numbers.length ; j++) {
                if(i != j && numbers[i] * numbers[j] > result) {
                    result = numbers[i] * numbers[j];
                }
            }
        }
        
        return result;
    }
}