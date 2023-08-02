class Solution {
    public int solution(int n) {
        String[] arr = String.valueOf(Integer.toString(n, 3)).split("");
        StringBuilder sb = new StringBuilder();
        for(int i = arr.length-1 ; i >= 0 ; i--) {
            sb.append(arr[i]);
        }
        return Integer.parseInt(sb.toString(), 3);
    }
}