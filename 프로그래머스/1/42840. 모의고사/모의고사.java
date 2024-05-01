import java.util.*;
class Solution {
    public int[] solution(int[] answers) {
        int[] supo1 = {1,2,3,4,5};//1번 패턴
        int[] supo2 = {2,1,2,3,2,4,2,5};//2번 페턴
        int[] supo3 = {3,3,1,1,2,2,4,4,5,5};//3번 패턴
        int[] cnt = {0,0,0};//패턴 반복을 위한 카운트
        int[] score = {0,0,0};//1~3 점수

        for (int i = 0; i < answers.length; i++) {//문제 수 만큼 반복
            if (supo1[cnt[0]++] == answers[i]) {//1패턴이랑 정답 대조 후 카운트+1
                score[0] += 1;//정답이면 점수+1
            }
            if (supo2[cnt[1]++] == answers[i]) {//2패턴이랑 정답 대조 후 카운트+1
                score[1] += 1;//정답이면 점수+1
            }
            if (supo3[cnt[2]++] == answers[i]) {//2패턴이랑 정답 대조 후 카운트+1
                score[2] += 1;//정답이면 점수+1
            }
            if (cnt[0] >= supo1.length) cnt[0] = 0;//1패턴 카운트 초기화해서 패턴 무한 반복
            if (cnt[1] >= supo2.length) cnt[1] = 0;//2패턴 카운트 초기화해서 패턴 무한 반복
            if (cnt[2] >= supo3.length) cnt[2] = 0;//3패턴 카운트 초기화해서 패턴 무한 반복
        }
        
        int max = Arrays.stream(score).max().getAsInt();//1~3 최고 점수
        int maxCnt = (int) Arrays.stream(score).filter(n -> n == max).count();//동점자 카운트
        int[] answer = new int[maxCnt];//동점자 수 크기의 배열 생성
        maxCnt = 0;
        for (int i = 0; i < 3; i++) {
            if (score[i] == max) answer[maxCnt++] = i+1;//1~3 1등 누구인지 판별
        }
        return answer;
    }
}