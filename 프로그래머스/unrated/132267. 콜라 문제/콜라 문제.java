class Solution {
    public int solution(int a, int b, int n) {
        int sum = n / a * b;
        n = (n / a) * b + (n % a);
        if(n >= a) {
            sum += solution(a,b,n);
        }
        return sum;
    }
}