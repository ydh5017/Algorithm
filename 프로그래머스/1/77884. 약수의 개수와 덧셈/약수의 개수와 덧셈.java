import java.util.stream.IntStream;
class Solution {
    public int solution(int left, int right) {
        // for (int i=left;i<=right;i++) {
        //     //제곱수인 경우 약수의 개수가 홀수
        //     if (i % Math.sqrt(i) == 0) {
        //         answer -= i;
        //     }
        //     //제곱수가 아닌 경우 약수의 개수가 짝수
        //     else {
        //         answer += i;
        //     }
        // }

        int answer = IntStream.rangeClosed(left, right).map(n -> {
            int count = 1;
            for (int i = 1; i <= n/2; i++) {
                if (n % i == 0) {
                    count++;
                }
            }
            return count % 2 == 0 ? n : n * -1;
        }).sum();
        return answer;
    }
}