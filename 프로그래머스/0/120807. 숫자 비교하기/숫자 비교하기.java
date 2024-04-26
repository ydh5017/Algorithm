class Solution {
    public int solution(int num1, int num2) {
        int answer =0;
        if(vaild(num1) && vaild(num2)) {
            answer = (num1 == num2) ? 1 : -1;
        }
        return answer;
    }
    private boolean vaild(int number) {
        return number >= 0 && number <= 10000;
    }
}