class Solution {
    public int solution(String A, String B) {
        return B.concat(B).indexOf(A);
    }
}