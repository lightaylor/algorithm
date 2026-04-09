package programmers._2018_kakao_blind_recruitement.friends_four_block;

import java.util.ArrayList;
import java.util.List;

class Solution {
    private static final char EMPTY = ' ';

    public int solution(int m, int n, String[] board) {
        char[][] origin = new char[m][n];
        int count = 0;

        for (int i = 0; i < m; i++) origin[i] = board[i].toCharArray();

        boolean bool = true;
        while (bool) {
            bool = false;
            boolean[][] toRemove = new boolean[m][n];

            for (int x = 0; x < m - 1; x++) {
                for (int y = 0; y < n - 1; y++) {
                    char root = origin[x][y];
                    if (root != EMPTY &&
                        root == origin[x + 1][y] &&
                        root == origin[x][y + 1] &&
                        root == origin[x + 1][y + 1]) {
                        bool = true;
                        toRemove[x][y] = toRemove[x + 1][y] = true;
                        toRemove[x][y + 1] = toRemove[x + 1][y + 1] = true;
                    }
                }
            }

            for (int x = 0; x < m; x++)
                for (int y = 0; y < n; y++)
                    if (toRemove[x][y]) { origin[x][y] = EMPTY; count++; }

            for (int y = 0; y < n; y++) {
                List<Character> col = new ArrayList<>();
                for (int x = 0; x < m; x++)
                    if (origin[x][y] != EMPTY) col.add(origin[x][y]);

                int empty = m - col.size();
                for (int x = 0; x < m; x++)
                    origin[x][y] = x < empty ? EMPTY : col.get(x - empty);
            }
        }

        return count;
    }
}