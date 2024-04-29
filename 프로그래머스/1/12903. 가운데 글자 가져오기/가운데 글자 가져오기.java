class Solution {
    public String solution(String s) {
        int i = s.length() / 2;
        String answer = s.length() % 2 == 0 ? s.substring(i-1, i+1) : s.substring(i, i+1);
        return answer;
    }
}