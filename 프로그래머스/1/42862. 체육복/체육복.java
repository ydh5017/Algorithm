class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int[] cnt = new int[n];
        int answer = n;
        for (int i = 0; i < lost.length; i++) {
            cnt[lost[i]-1]--;
        }
        for (int i = 0; i < reserve.length; i++) {
            cnt[reserve[i]-1]++;
        }
        for (int i = 0; i < cnt.length; i++) {
            if (cnt[i] == -1) {
                if (i-1>=0 && cnt[i - 1] == 1) {
                    cnt[i]++;
                    cnt[i - 1]--;
                }else if (i + 1 < cnt.length && cnt[i + 1] == 1) {
                    cnt[i]++;
                    cnt[i + 1]--;
                }else {
                    answer--;
                }
            }
        }
        return answer;
    }
}