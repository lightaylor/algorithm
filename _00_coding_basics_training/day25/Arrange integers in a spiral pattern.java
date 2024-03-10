class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        int move = 1;
        int i = 0, j = 0;
        answer[i][j] = move++;

        while(move <= n*n) {
            if (j < n - 1 && answer[i][j+1] == 0) {
                if (i > 0 && answer[i-1][j] == 0) i -= 1;
                else j += 1;
            }
            else if (i < n - 1 && answer[i+1][j] == 0) i += 1;
            else if (j > 0 && answer[i][j-1] == 0) j -= 1;
            else if (i > 0 && answer[i-1][j] == 0) i -= 1;
            answer[i][j] = move++;
        }

        return answer;
    }
}
