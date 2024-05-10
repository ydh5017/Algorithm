import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
class Solution {
    public String solution(String s, String skip, int index) {
        String answer = "";
        
        List<String> alphabets = IntStream.rangeClosed('a', 'z')
                .mapToObj(i -> String.format("%c", i))
                .filter(el -> !skip.contains(el))
                .collect(Collectors.toList());
        
        for (int i = 0; i < s.length(); i++) {
            int idx = alphabets.indexOf(String.valueOf(s.charAt(i)));
            int idx2 = (idx + index) % alphabets.size();
            answer += alphabets.get(idx2);
        }
        return answer;
    }
}