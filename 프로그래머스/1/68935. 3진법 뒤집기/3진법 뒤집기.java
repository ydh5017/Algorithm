class Solution {
    public int solution(int n) {
        int answer = 0;
        while (n > 0) {
            // n/3 = 몫, n%3 = 나머지 = 3진법 거꾸로
            answer = answer * 3 + n % 3;
            n /= 3;
        }
        return answer;
    }
}