class Solution {
    public long solution(long n) {
        // long answer = 0;
        // for(long x = 1; x * x <= n; x++){
        //     if(x * x == n){
        //         answer = x + 1;
        //     }
        // }
        // return answer == 0 ? -1 : answer * answer;
        
        //pow :  제곱값 구하는 메서드, sqrt : 제곱근 구하는 메서드
        if (Math.pow((int)Math.sqrt(n), 2) == n) {
            return (long)Math.pow((int)Math.sqrt(n) + 1, 2);
        }
        return -1;
    }
}