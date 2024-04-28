import java.util.stream.LongStream;
class Solution {
    public int solution(int num) {
        if (num == 1) {
            return 0;
        }
        int answer = LongStream.of(num).mapToInt(a -> {
            int count = 0; // 총 반복 횟수
            while (true) {
                a = a % 2 == 0 ? a / 2 : a * 3 + 1; // a변수에 연산한 값 저장
                count++; // 반복 횟수 증가
                if (count >= 500) { // 반복 횟수가 500 이상이면 -1 리턴
                    return -1;
                }
                if (a == 1) { // 연산 종료 시 반복 횟수 리턴
                    return count;
                }
            }
        }).sum();
        return answer;
    }
}