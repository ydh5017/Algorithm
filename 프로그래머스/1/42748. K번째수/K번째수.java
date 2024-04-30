import java.util.stream.IntStream;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for (int i = 0; i < commands.length; i++) {
            answer[i] = IntStream
                    .rangeClosed(commands[i][0]-1, commands[i][1]-1)
                    .map(n->array[n]).sorted()
                    .skip(commands[i][2]-1)
                    .limit(1).sum();
        }
        return answer;
    }
}