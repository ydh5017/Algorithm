import java.util.*;
class Solution {
    public String solution(String[] survey, int[] choices) {
        String answer = "";
        char[] c = {'R', 'T', 'C', 'F', 'J', 'M', 'A', 'N'};
        Map<Character, Integer> map = new HashMap<>();
        
        for (int i = 0; i < c.length; i++) {
            map.put(c[i], 0);
        }
        for (int i = 0; i < survey.length; i++) {
            if (choices[i] < 4) {
                map.put(survey[i].charAt(0), map.get(survey[i].charAt(0)) + 4 - choices[i]);
            }else if (choices[i] > 4) {
                map.put(survey[i].charAt(1), map.get(survey[i].charAt(1)) + choices[i] - 4);
            }
        }
        
        answer += map.get('R') >= map.get('T') ? 'R' : 'T';
        answer += map.get('C') >= map.get('F') ? 'C' : 'F';
        answer += map.get('J') >= map.get('M') ? 'J' : 'M';
        answer += map.get('A') >= map.get('N') ? 'A' : 'N';
        return answer;
    }
}