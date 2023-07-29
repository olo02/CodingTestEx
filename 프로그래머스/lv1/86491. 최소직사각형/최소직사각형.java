class Solution {
    public int solution(int[][] sizes) {
        int row = 0;
        int col = 0;
        
        for(int[] arr : sizes){
            row = Math.max(row, Math.max(arr[0], arr[1]));
            col = Math.max(col, Math.min(arr[0], arr[1]));
        }
        
        return row*col;
    }
}