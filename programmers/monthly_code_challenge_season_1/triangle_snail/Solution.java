package programmers.monthly_code_challenge_season_1.triangle_snail;

class Solution {
    public int[] solution(int n) {
        int[] answer = new int[idx(n, 0)];
        int x = -1, y = 0, num = 1;

        for (int len = n; len > 0; len -= 3) {
            for (int j = 0; j < len; j++) {
                x++;
                answer[idx(x, y)] = num++;
            }

            for (int j = 1; j < len; j++) {
                y++;
                answer[idx(x, y)] = num++;
            }

            for (int i = 2; i < len; i++) {
                x--;
                y--;
                answer[idx(x, y)] = num++;
            }
        }
        return answer;
    }

    private int idx(int x, int y) {
        return (x * (x + 1)) / 2 + y;
    }
}
