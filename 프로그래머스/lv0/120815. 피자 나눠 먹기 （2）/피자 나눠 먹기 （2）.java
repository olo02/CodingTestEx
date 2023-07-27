import java.util.*;

class Solution {
    public int solution(int n) {
        int pizza = 1;
        for(int i = 1 ; i < n*6 ; i++) {
            if((i*6) % n == 0) {
                pizza = i;
                break;
            } 
        }
        return pizza;
    }
}