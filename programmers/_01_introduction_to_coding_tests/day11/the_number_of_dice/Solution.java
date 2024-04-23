package _01_introduction_to_coding_tests.day11.the_number_of_dice;

class Solution {
    public int solution(int[] box, int n) {
        int answer = (box[0] / n) * (box[1] / n) * (box[2] / n);
        return answer;
    }
}
