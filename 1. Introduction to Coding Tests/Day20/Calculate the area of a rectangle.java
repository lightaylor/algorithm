import java.lang.*;

class Solution {
    public int solution(int[][] dots) {
        int answer = 0;

        int x = Math.abs(dots[0][0] - dots[1][0]) == 0 ? Math.abs(dots[0][0] - dots[2][0]) : Math.abs(dots[0][0] - dots[1][0]);
        int y = Math.abs(dots[1][1] - dots[2][1]) == 0 ? Math.abs(dots[1][1] - dots[3][1]) : Math.abs(dots[1][1] - dots[2][1]);
        answer = x * y;

        return answer;
    }
}
