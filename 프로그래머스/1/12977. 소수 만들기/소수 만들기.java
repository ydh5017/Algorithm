import java.util.*;
class Solution {
    public int solution(int[] nums) {
        List<Integer> sum = new ArrayList<>();//합한 값을 담을 리스트 생성
        for (int i = 0; i < nums.length-2; i++) {//a
            for (int j = i+1; j < nums.length-1; j++) {//b
                for (int k = j+1; k < nums.length; k++) {//c
                    sum.add(nums[i] + nums[j] + nums[k]);//a+b+c -> 리스트에 저장
                }
            }
        }
        int answer = (int) sum.stream().filter(n->{//조건문으로 소수가 아니면 걸러줌
            //소수 판별 : 범위(2~n의 제곱근)중에 나눠 값이 있으면 소수 x
            for (int i = 2; i <= (int)Math.sqrt(n); i++) if(n%i==0) return false;
            return true;
        }).count();//걸러진 값들 카운트
        return answer;
    }
}