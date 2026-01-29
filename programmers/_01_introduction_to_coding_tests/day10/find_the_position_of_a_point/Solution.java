package programmers._01_introduction_to_coding_tests.day10.find_the_position_of_a_point;

class Solution {
    public int solution(int[] dot) {
        int x = dot[0];
        int y = dot[1];

        if (x > 0 && y > 0) return 1;
        else if (x < 0 && y > 0) return 2;
        else if (x < 0 && y < 0) return 3;
        else if (x > 0 && y < 0) return 4;
        return 0;
    }
}
