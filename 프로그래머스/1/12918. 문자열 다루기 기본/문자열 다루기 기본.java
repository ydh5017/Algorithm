class Solution {
    public boolean solution(String s) {
        if (s.length() != 4 && s.length() != 6) {
            return false;
        }
        String NUMBER_REG = "^[0-9]+$";
        boolean answer = s.matches(NUMBER_REG);
        return answer;
    }
}