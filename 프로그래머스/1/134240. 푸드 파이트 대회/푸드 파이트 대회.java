import java.util.*;
class Solution {
    public String solution(int[] food) {
         int[] cnt = new int[food.length-1];
        String answer = "";

        for (int i = 1; i < food.length; i++) {
            cnt[i-1] = food[i] / 2;
        }
        for (int i = 0; i < cnt.length; i++) {
            while (cnt[i] != 0) {
                answer += i+1;
                cnt[i]--;
            }
        }
        return answer + "0" + new StringBuilder(answer).reverse().toString();
    }
}