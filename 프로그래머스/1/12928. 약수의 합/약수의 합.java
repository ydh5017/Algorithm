class Solution {
    public int solution(int n) {
        int answer = 0;
//         for(int i =1 ; i<=num/2;i++){ // for믄 동작 횟수가 훨씬 적음
//             if(num%i==0) {
//                 answer+=i;
//             }
//         }

//         return answer+num;
        
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                answer += i;
            }
        }
        return answer;
    }
}