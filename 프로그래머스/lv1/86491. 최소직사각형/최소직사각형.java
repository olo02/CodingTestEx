class Solution {
    public int solution(int[][] sizes) {
        int row = 0;
        int col = 0;
        
        for(int i = 0 ; i < sizes.length ; i++){
            row = row < Math.max(sizes[i][0], sizes[i][1]) ? 
                Math.max(sizes[i][0], sizes[i][1]) : row;
            col = col < Math.min(sizes[i][0], sizes[i][1]) ?
                Math.min(sizes[i][0], sizes[i][1]) : col;
        }
        return row*col;
    }
}