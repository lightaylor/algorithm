package programmers.learn.courses30.lessons12971;

class Solution {
    public int solution(int sticker[]) {
        int n = sticker.length;

        if (n == 1) return sticker[0];
        
        return Math.max(max(sticker, 0, n - 2), max(sticker, 1, n - 1));
    }

    private int max(int[] sticker, int start, int end) {
        int prev2 = 0;
        int prev1 = 0;

        for (int i = start; i <= end; i++) {
            int current = Math.max(prev1, prev2 + sticker[i]);
            prev2 = prev1;
            prev1 = current;
        }
        return prev1;
    }
}
