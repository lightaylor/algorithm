package programmers.monthly_code_challenge_season_1.count_after_quad_compression;

class Solution {
    public int[] solution(int[][] arr) {
        int[] count = new int[2];
        dfs(count, arr, 0, 0, arr.length);
        return count;
    }

    private void dfs(int[] count, int[][] arr, int x, int y, int size) {
        if (isSame(arr, x, y, size)) {
            count[arr[x][y]]++;
            return;
        }

        int newSize = size / 2;
        dfs(count, arr, x, y, newSize);
        dfs(count, arr, x + newSize, y, newSize);
        dfs(count, arr, x, y + newSize, newSize);
        dfs(count, arr, x + newSize, y + newSize, newSize);
    }

    private boolean isSame(int[][] arr, int x, int y, int size) {
        int target = arr[x][y];
        for (int i = x; i < x + size; i++) {
            for (int j = y; j < y + size; j++) {
                if (arr[i][j] != target) {
                    return false;
                }
            }
        }

        return true;
    }
}
