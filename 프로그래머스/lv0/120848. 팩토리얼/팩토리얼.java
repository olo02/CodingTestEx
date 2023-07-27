class Solution {
    public int solution(int n) {
        int result = 0;
        int multiply = 1;
        for(int i = 1;  ; i++){
            multiply *= i;
            if(multiply == n){
                result = i;
                break;
            } else if(multiply > n) {
                result = i-1;
                break;
            }
        }
        return result;
    }
}