import java.util.stream.IntStream;
class Solution {
    public int solution(int left, int right) {
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