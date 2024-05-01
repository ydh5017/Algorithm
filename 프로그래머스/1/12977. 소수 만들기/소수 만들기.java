import java.util.*;
class Solution {
    public int solution(int[] nums) {
        List<Integer> sum = new ArrayList<>();
        for (int i = 0; i < nums.length-2; i++) {
            for (int j = i+1; j < nums.length-1; j++) {
                for (int k = j+1; k < nums.length; k++) {
                    sum.add(nums[i] + nums[j] + nums[k]);
                }
            }
        }
        int answer = (int) sum.stream().filter(n->{
            for (int i = 2; i <= (int)Math.sqrt(n); i++) if(n%i==0) return false;
            return true;
        }).count();
        return answer;
    }
}