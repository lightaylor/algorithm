package _00_coding_basics_training.day23.dice_game_1;

class Solution {
    public int solution(int a, int b) {
        if(a % 2 > 0 && b % 2 > 0) {
            return a * a + b * b;
        } else if(a % 2 > 0 || b % 2 > 0) {
            return 2 * (a + b);
        } else {
            return a > b ? a - b : b - a;
        }
    }
}
