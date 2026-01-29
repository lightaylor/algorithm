package programmers._2019_kakao_winter_internship.crane_doll_picking_game;

import java.util.Stack;

class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();

        for (int move : moves) {
            for(int[] doll : board) {
                if (doll[move - 1] != 0) {
                    if (!stack.isEmpty() && stack.peek() == doll[move - 1]) {
                        answer += 2;
                        stack.pop();
                    } else {
                        stack.add(doll[move - 1]);
                    }
                    doll[move - 1] = 0;
                    break;
                }
            }
        }

        return answer;
    }
}
