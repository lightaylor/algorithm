class Solution {
    public int solution(int[][] board) {
        int answer = 0;
        int n = board.length;
        int [][] map = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 1) {
                    updateMap(i, j, map);
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (map[i][j] == 0) {
                    answer ++;
                }
            }
        }

        return answer;
    }

    public void updateMap(int x, int y, int[][] map) {
        map[x][y] = 1;

        if (y + 1 < map.length) {
            map[x][y+1] = 1;
        }

        if (y - 1 >= 0) {
            map[x][y-1] = 1;
        }

        if (x - 1 >= 0) {
            map[x-1][y] = 1;
        }

        if (x - 1 >= 0 && y - 1 >= 0) {
            map[x-1][y-1] = 1;
        }

        if (x - 1 >= 0 && y + 1 < map.length) {
            map[x-1][y+1] = 1;
        }

        if (x + 1 < map.length) {
            map[x+1][y] = 1;
        }

        if (x + 1 < map.length && y + 1 < map.length) {
            map[x+1][y+1] = 1;
        }

        if (x + 1 < map.length && y - 1 >= 0) {
            map[x+1][y-1] = 1;
        }
    }
}