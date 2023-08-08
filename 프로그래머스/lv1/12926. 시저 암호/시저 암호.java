class Solution {
    public String solution(String s, int n) {
        char[] chars = new char[s.length()];
        int index = 0;
        
        for(char str : s.toCharArray()) {
            if(str >= 'A' && str <= 'Z') {
                str += str + n >= 'A' + 26 ? n - 26 : n;
            } else if (str >= 'a' && str <= 'z') {
                str += str + n >= 'a' + 26 ? n - 26 : n;
            }
            chars[index] = str;
            index++;
        }
        
        return String.valueOf(chars);
    }
}