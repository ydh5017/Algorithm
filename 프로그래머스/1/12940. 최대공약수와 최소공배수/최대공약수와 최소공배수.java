class Solution {
    public int[] solution(int n, int m) {
        int g = n < m ? n : m;
        int l = 0;
        while (true) {
            if (n % g == 0 && m % g == 0) {
                break;
            }else {
                g--;
            }
        }
        l = (n/g) * (m/g) * g;
        int[] answer = {g, l};
        return answer;
    }
}