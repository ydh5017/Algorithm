import java.util.Arrays;
class Solution {
    public String solution(String[] seoul) {
        int answer = Arrays.asList(seoul).indexOf("Kim");
        return "김서방은 "+answer+"에 있다";
    }
}