import java.util.stream.IntStream;
class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int min = (int) IntStream.of(lottos).filter(n -> n > 0)//로또번호 중 0인 경우 제외
            .filter(n -> {//당첨번호와 일치하는지 대조
                for (int num : win_nums) if (n == num) return true;
                return false;})
            .count();//일치하는 번호 개수 카운트
        switch (min) {//일치하는 번호 개수에 따라 순위로 변경
            case 2: min = 5; break;
            case 3: min = 4; break;
            case 4: min = 3; break;
            case 5: min = 2; break;
            case 6: min = 1; break;
            default: min = 6;
        }
        int max = min - (int) IntStream.of(lottos).filter(n -> n == 0).count();//최저순위에 따라 최고순위 계산
        int[] answer = {max == 0 ? 1 : max, min};
        return answer;
    }
}