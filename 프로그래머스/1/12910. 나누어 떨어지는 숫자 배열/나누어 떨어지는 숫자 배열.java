import java.util.Arrays;
class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] answer;
        answer = Arrays.stream(arr) // 스트림 생성
                .filter(n -> n % divisor == 0) // 나눈 몫이 0인 경우만 필터링
                .sorted() // 정렬
                .toArray(); // 배열로 반환
        if (answer.length == 0) { // 배열에 값이 없을 경우
            answer = new int[]{-1}; // -1을 담은 배열로 새로 생성
        }
        return answer;
    }
}