package programmers.practice_exercise.tower_of_hanoi;

import java.util.ArrayList;
import java.util.List;

class Solution {
    private final List<int[]> moves = new ArrayList<>();

    public int[][] solution(int n) {
        move(n, 1, 2, 3);
        return moves.toArray(new int[moves.size()][]);
    }

    private void move(int n, int from, int via, int to) {
        if (n == 0) return;

        move(n - 1, from, to, via);
        moves.add(new int[]{from, to});
        move(n - 1, via, from, to);
    }
}
