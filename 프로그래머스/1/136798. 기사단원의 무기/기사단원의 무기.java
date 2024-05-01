class Solution {
    public int solution(int number, int limit, int power) {
        int cnt = 0;//약수 개수 카운트
        int answer = 0;
        for (int i = 1; i <= number; i++) {//기사 수만큼 반복
            cnt = 0;//약수 개수 초기화
            for (int j = 1; j*j <= i; j++) {//약수 개수 구하기
                if (j * j == i) cnt++;
                else if (i % j == 0) cnt+=2;
            }
            if (cnt > limit) {//제한수치 초과 시
                cnt = power;
            }
            answer += cnt;//공격력 합
        }
        return answer;
    }
}