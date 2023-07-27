import java.util.stream.IntStream;
import java.util.stream.Collectors;

class Solution {
    public int solution(int[] array) {
        int[] freq = new int[array.length];
        int max = 0;
        int index = 0;

        for(int i = 0; i < array.length ; i++) {
            for(int j = 0; j < array.length ; j++){
                if(array[i] == array[j]) freq[i] += 1;
            }

            if(freq[i] > max) {
                max = freq[i];
                index = i;
            }
        }
        
        int finalMax = max;
        return IntStream.of(freq).filter(n -> n == finalMax).count() > max
            ? -1 : array[index];
    }
}