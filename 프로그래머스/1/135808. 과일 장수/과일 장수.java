import java.util.*;
import java.util.stream.IntStream;
class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        Arrays.sort(score); //정렬

        for(int i = score.length; i >= m; i -= m){
            //m개 단위로 자르며 맨 앞의 요소에 m을 곱해서 answer에 더해줌(정렬해서 맨 앞이 가장 낮은 점수)
            answer += score[i - m] * m;
        }
        return answer;
    }
}