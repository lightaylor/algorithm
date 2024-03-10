package _01_introduction_to_coding_tests.day25.next_number;

class Solution {
    public int solution(int[] common) {
        if (common[2] - common[1] == common[1] - common[0]) {
            return common[common.length - 1] + (common[2] - common[1]);
        } else {
            return common[common.length - 1] * (common[2] / common[1]);
        }
    }
}
