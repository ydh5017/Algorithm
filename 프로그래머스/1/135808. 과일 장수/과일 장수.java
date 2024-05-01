import java.util.*;
import java.util.stream.IntStream;
class Solution {
    public int solution(int k, int m, int[] score) {
        Integer[] scoreArr = Arrays.stream(score).boxed().toArray(Integer[]::new);
        int answer = 0;
        Arrays.sort(scoreArr, Collections.reverseOrder());
        for (int i = 0; i < scoreArr.length / m; i++) {
            int result = IntStream.rangeClosed(0+(i*m), (m-1)+(i*m))
                    .map(n -> scoreArr[n]).min().getAsInt();
            answer += result*m;
        }
        return answer;
    }
}