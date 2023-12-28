import java.lang.*;
import java.util.*;

class Solution {
    public int solution(int[][] board) {
        int max = board.length;
        int answer = (int)Math.pow(max, 2);
        List array = new ArrayList<String>();

        for(int i = 0; i < max; i++) {
            for (int j = 0; j < max; j++) {
                String key = i + "-" + j;
                if (board[i][j] == 1) {
                    System.out.println("test : " + answer);
                    answer -= 1;
                    if ((i-1 >= 0 || j-1 >= 0) && !array.contains(key)) {
                        array.add((i-1) + "-" + (j-1));
                        answer -= 4;
                        System.out.println("-1 : " + answer);
                    }

                    if ((i+1 < max || j+1 < max) && !array.contains(key)) {
                        array.add((i+1) + "-" + (j+1));
                        answer -= 4;
                        System.out.println("+1 : " + answer);
                    }
                }
            }
        }

        return answer;
    }
}
