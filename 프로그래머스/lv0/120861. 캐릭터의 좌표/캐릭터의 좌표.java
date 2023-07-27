class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int x = 0;
        int y = 0;
        for(String key : keyinput){
            x += key.equals("left") ? -1 : key.equals("right") ? 1 : 0;
            y += key.equals("down") ? -1 : key.equals("up") ? 1 : 0;
            if(x > board[0]/2) x--;
            else if(x < -board[0]/2) x++;
            else if(y > board[1]/2) y--;
            else if(y < -board[1]/2) y++;
        }
        return new int[] {x,y};
    }
}