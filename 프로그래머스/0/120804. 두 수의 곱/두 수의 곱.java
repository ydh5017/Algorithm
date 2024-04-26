class Solution {
    public int solution(int num1, int num2) {
        int answer = 0;
        if (valid(num1) && valid(num2)) {
            answer = num1 * num2;
        }
        return answer;
    }
    
    private boolean valid(int number) {
        return number >= 0 && number <= 100;
    }
}