class Solution {
    public String solution(String s) {
        String answer = "";
        int index = 0;
        String[] strArr = s.split("");
        for (String str : strArr) {
            index = str.contains(" ") ? 0 : index + 1;
            answer += index % 2 == 0 ? str.toLowerCase() : str.toUpperCase();
        }
        return answer;
    }
}