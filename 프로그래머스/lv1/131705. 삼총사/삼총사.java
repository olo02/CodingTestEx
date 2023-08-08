class Solution {
    public int solution(int[] number) {
        int answer = 0;
        // number 배열에서 요소의 포함/불포함 여부를 1/0 즉 이진수로 생각
        
        // number 배열의 부분집합 개수만큼 반복 (이진수로 치환하여 대입)
        for(int i = 0 ; i < (1 << number.length) ; i++) {
            // 부분집합의 원소 수가 3개인 경우만 한정 (이진수에서 1의 개수가 3인 경우)
            if(Integer.bitCount(i) != 3) continue;
            
            int sum = 0;
            // 현재 부분집합의 원소와 배열의 각 요소를 비교하여
            // 해당 배열의 요소를 부분집합이 가지고 있는 경우, 요소를 합함
            // 즉 sum = 현재 부분집합의 원소 합
            for(int j = 0 ; j < number.length ; j++) {
                if((i & 1 << j) != 0) sum += number[j];
            }
            
            // 각 원소의 합계가 0인 경우
            if(sum == 0) answer++;
        }
        
        return answer;
    }    
}