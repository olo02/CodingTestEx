import java.util.Stack;

public class Solution {
    public int[] solution(int[] arr) {
        Stack stk = new Stack();
        for(int i = 0 ; i < arr.length ; i++) {
            stk.push(arr[i]);
            if(i != 0 && arr[i] == arr[i-1]) stk.pop();
        }
        return stk.stream().mapToInt(i -> (int) i).toArray();
    }
}