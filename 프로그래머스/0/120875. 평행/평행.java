import java.util.*;
import java.util.stream.*;

class Solution {
    public int solution(int[][] dots) {           
        for(int x = 1 ; x < 4 ; x++) {
            int xx = x;
            List<int[]> lst = Arrays.stream(dots).filter(dot -> dot != dots[xx]).collect(Collectors.toList());
            Double a = (double)(dots[x][0]-dots[0][0])/(dots[x][1]-dots[0][1]);
            Double b = (double)(lst.get(2)[0]-lst.get(1)[0])/(lst.get(2)[1]-lst.get(1)[1]);

            if(Double.compare(a,b) == 0) {
                return 1;
            }
        }
        return 0;
    }
}