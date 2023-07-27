class Solution {
    public int solution(int chicken) {
        int service = 0;
        int remain = 0;
        
        while(true) {
            service += useCoupon(chicken);
            chicken = useCoupon(chicken) + remainCoupon(chicken);
            if(chicken < 10){
                break;
            } 
        }
        return service;
    }
            
    private int useCoupon(int number) {
        return number / 10;    
    }
    private int remainCoupon(int number) {
        return number % 10;
    }
}