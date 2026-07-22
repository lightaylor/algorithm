package programmers.learn.courses30.lessons468379;

import java.util.Arrays;

class Solution {
    public int[] solution(int m, int n, int h, int w, int[][] drops) {
        int neverRain = drops.length + 1;

        int[][] board = new int[m][n];
        for (int[] row : board) {
            Arrays.fill(row, neverRain);
        }

        // 각 칸에 최초로 비가 내리는 시간
        for (int time = 0; time < drops.length; time++) {
            int row = drops[time][0];
            int col = drops[time][1];
            board[row][col] = Math.min(board[row][col], time + 1);
        }

        int horizontalCount = n - w + 1;
        int verticalCount = m - h + 1;

        // horizontal[row][left]
        int[][] horizontal = new int[m][horizontalCount];
        for (int row = 0; row < m; row++) {
            horizontal[row] = slidingMin(board[row], w);
        }

        int[][] firstRain = new int[verticalCount][horizontalCount];

        // horizontal 각 열을 가져와 세로 h칸 슬라이딩 최소값 계산
        for (int left = 0; left < horizontalCount; left++) {
            int[] column = new int[m];

            for (int row = 0; row < m; row++) {
                column[row] = horizontal[row][left];
            }

            int[] verticalMain = slidingMin(column, h);

            for (int top = 0; top < verticalCount; top++) {
                firstRain[top][left] = verticalMain[top];
            }
        }

        int bestTime = -1;
        int bestRow = 0;
        int bestCol = 0;

        for (int top = 0; top < verticalCount; top++) {
            for (int left = 0; left < horizontalCount; left++) {
                if (firstRain[top][left] > bestTime) {
                    bestTime = firstRain[top][left];
                    bestRow = top;
                    bestCol = left;
                }
            }
        }

        return new int[]{bestRow, bestCol};
    }

    // values 에서 연속한 size 개 구간마다 최소값을 구한다.
    private int[] slidingMin(int[] values, int size) {
        int resultLength = values.length - size + 1;
        int[] result = new int[resultLength];

        // deque 에는 인덱스 저장
        int[] deque = new int[values.length];
        int head = 0;
        int tail = 0;

        for (int i = 0; i < values.length; i++) {
            int windowStart = i - size + 1;

            while (head < tail && deque[head] < windowStart) {
                head++;
            }

            while (head < tail && values[deque[tail - 1]] >= values[i]) {
                tail--;
            }

            deque[tail++] = i;

            if (windowStart >= 0) {
                result[windowStart] = values[deque[head]];
            }
        }
        return result;
    }
}
