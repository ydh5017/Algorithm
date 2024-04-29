class Solution {
    public String solution(int n) {
        String answer = "";
        for (int i = 1; i <= n; i++) {
                answer += i % 2 == 0 ? "박" : "수";
        }
        return answer;
        // return new String(new char [n/2+1]).replace("\0", "수박").substring(0,n);
    }
}