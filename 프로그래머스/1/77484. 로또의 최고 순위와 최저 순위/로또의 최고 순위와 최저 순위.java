import java.util.stream.IntStream;
class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int min = (int) IntStream.of(lottos).filter(n -> n > 0).filter(n -> {
            for (int num : win_nums) if (n == num) return true;
            return false;
        }).count();
        switch (min) {
            case 2: min = 5; break;
            case 3: min = 4; break;
            case 4: min = 3; break;
            case 5: min = 2; break;
            case 6: min = 1; break;
            default: min = 6;
        }
        int max = min - (int) IntStream.of(lottos).filter(n -> n == 0).count();
        int[] answer = {max == 0 ? 1 : max, min};
        return answer;
    }
}