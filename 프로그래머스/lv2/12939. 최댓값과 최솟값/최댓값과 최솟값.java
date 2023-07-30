import java.util.Arrays;

class Solution {
    public String solution(String s) {
        long[] arr = Arrays.stream(s.split(" ")).mapToLong(Long::parseLong).sorted().toArray();
        return arr[0] + " " + arr[arr.length-1];
    }
}