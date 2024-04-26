import java.util.stream.Stream;
class Solution {
    public int[] solution(long n) {
        String  str = String.valueOf(n);
        int[] arr = Stream.of(str.split("")).mapToInt(Integer::parseInt).toArray();
        int[] answer = new int[str.length()];
        
        for (int i = 0; i < arr.length; i++) {
            answer[i] = arr[arr.length - 1 - i];
        }
        
        return answer;
//        return new StringBuilder().append(n).reverse().chars().map(Character::getNumericValue).toArray();
    }
}