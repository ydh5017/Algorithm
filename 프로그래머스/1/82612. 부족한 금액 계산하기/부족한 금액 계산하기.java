import java.util.stream.LongStream;
class Solution {
    public long solution(int price, int money, int count) {
        long answer = LongStream.rangeClosed(1, count).map(n -> n * price).sum();
        return money < answer ? answer - money : 0;
        
        // 등차수열 합공식 r(n(n+1))/2 r= 차수 n=count
        // return Math.max(price * (count * (count + 1) / 2) - money, 0);
    }
}