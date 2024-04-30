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
        
        // int[] answer = new int[commands.length];
        // for(int i=0; i<commands.length; i++){
        //     int[] temp = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);
        //     Arrays.sort(temp);
        //     answer[i] = temp[commands[i][2]-1];
        // }
        return answer;
    }
}