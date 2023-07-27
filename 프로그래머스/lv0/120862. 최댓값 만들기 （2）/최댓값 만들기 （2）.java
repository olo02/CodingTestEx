import java.util.stream.IntStream;

class Solution {
    public int solution(int[] numbers) {
        double[] arr = IntStream.of(numbers).sorted().mapToDouble(i -> i).toArray();
        
        int max1 = (int) (arr[arr.length-1] * arr[arr.length-2]);
        int max2 = (int) (arr[0] * arr[1]);
        
        return max1 >= max2 ? max1 : max2;
    }
}