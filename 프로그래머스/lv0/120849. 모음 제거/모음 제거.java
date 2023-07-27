class Solution {
    public String solution(String my_string) {
        
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0 ; i < my_string.length() ; i++) {
            char str = my_string.charAt(i);
            
            if(str != 'a' && str != 'e' && str != 'i'
              && str != 'o' && str != 'u')
                sb.append(str);
        }
        
        return sb.toString();
        
    }
}