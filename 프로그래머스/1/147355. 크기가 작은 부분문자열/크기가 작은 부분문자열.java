class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        int length = t.length() - (p.length() - 1);
        for (int i = 0; i < length; i++) {
            answer += Long.parseLong(t.substring(i, i+p.length())) <= Long.parseLong(p) ? 1 : 0;
        }
        return answer;
    }
}