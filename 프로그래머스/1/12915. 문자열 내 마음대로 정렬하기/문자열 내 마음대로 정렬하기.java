import java.util.*;
class Solution {
    public String[] solution(String[] strings, int n) {
        String[] answer = new String[strings.length];
        String[] list = new String[strings.length];
        for (int i = 0; i < strings.length; i++) {
            list[i] = strings[i].charAt(n)+strings[i];
        }
        Arrays.sort(list, String.CASE_INSENSITIVE_ORDER);

        for (int i = 0; i < list.length; i++) {
            answer[i] = list[i].substring(1);
        }
        return answer;
    }
}