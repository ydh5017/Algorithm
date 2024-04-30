import java.util.stream.IntStream;
class Solution {
    public int solution(int[][] sizes) {
        int w = IntStream.rangeClosed(0, sizes.length-1)
                .map(i -> Math.max(sizes[i][0], sizes[i][1])).max().getAsInt();
        int h = IntStream.rangeClosed(0, sizes.length-1)
                .map(i -> Math.min(sizes[i][0], sizes[i][1])).max().getAsInt();
        return w*h;
    }
}