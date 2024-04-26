class Solution {
    public int solution(int n) {
        int answer = 2;
        while (true) {
            if (n % answer == 1) {
                break;
            }
            answer++;
        }
        return answer;
        // return IntStream.range(2, n).filter(i -> n % i == 1).findFirst().orElse(0); // 단순 반복문에서 사용 x
    }
}