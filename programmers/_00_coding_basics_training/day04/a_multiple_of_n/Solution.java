package coding_basics_training.day04.a_multiple_of_n;

class Solution {
    public int solution(int num, int n) {
        int answer = num % n == 0 ? 1 : 0;
        return answer;
    }
}
