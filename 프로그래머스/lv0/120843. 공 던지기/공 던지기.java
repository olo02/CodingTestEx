class Solution {
    public int solution(int[] numbers, int k) {
        int count = (1+(k-1)*2);
        int length = numbers.length;
        
        return numbers[count % length == 0 ? length - 1 : count % length - 1];
    }
}