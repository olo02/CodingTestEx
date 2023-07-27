import java.util.Arrays;

class Solution {
    public String solution(String[] id_pw, String[][] db) {
        int result = Arrays.stream(db)
            .mapToInt(info -> info[0].equals(id_pw[0]) && info[1].equals(id_pw[1]) ? 2 
                 : info[0].equals(id_pw[0]) ? 1
                : 0).distinct().max().getAsInt();
        return result == 2 ? "login" : result == 1 ? "wrong pw" : "fail";
    }
}