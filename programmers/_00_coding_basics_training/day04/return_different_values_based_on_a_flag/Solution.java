package coding_basics_training.day04.return_different_values_based_on_a_flag;

class Solution {
    public int solution(int a, int b, boolean flag) {
        int answer = flag ? a + b : a - b;
        return answer;
    }
}
