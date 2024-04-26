import java.util.*;
import java.util.stream.Stream;

public class Solution {
    public int solution(int n) {
//         int answer = 0;

//         while(true){
//             answer+=n%10;
//             if(n<10)
//                 break;

//             n=n/10;
//         }
//      return answer;
        return Stream.of(String.valueOf(n).split("")).mapToInt(Integer::parseInt).sum();
    }
}