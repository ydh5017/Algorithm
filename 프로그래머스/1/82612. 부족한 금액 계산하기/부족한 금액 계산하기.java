import java.util.stream.LongStream;
class Solution {
    public long solution(int price, int money, int count) {
        long answer = LongStream.rangeClosed(1, count).map(n -> n * price).sum();
        return money < answer ? answer - money : 0;
    }
}