class Solution {
    public int solution(int n, int m, int[] section) {
        int roller = section[0];//롤러 시작 지점
        int answer = 1;//칠 한 횟수
        for(int i = 1; i < section.length; i++) {
            if(roller + m - 1 < section[i]) {//롤러 범위안에 다음 구역이 포함되는지 확인
                answer++;//횟수 증가
                roller = section[i];//롤러 칠할 지점 변경
            }
        }
        return answer;
    }
}