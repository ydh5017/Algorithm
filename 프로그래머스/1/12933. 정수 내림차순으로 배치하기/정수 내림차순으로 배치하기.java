import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;
class Solution {
    public long solution(long n) {
        int[] arr = Stream.of(String.valueOf(n).split("")).mapToInt(Integer::parseInt).toArray();
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        String str = Arrays.stream(arr).mapToObj(String::valueOf).collect(Collectors.joining());
        
        return Long.parseLong(str);
    }
}