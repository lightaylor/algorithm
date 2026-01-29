package programmers.coding_basics_training.day04.conditional_string;

class Solution {
    public int solution(String ineq, String eq, int n, int m) {
        Boolean answer;
        if (ineq.equals(">")) {
            answer = eq.equals("=") ? n >= m : n > m;
        } else {
            answer = eq.equals("=") ? n <= m : n < m;
        }
        return answer ? 1 : 0;
    }
}
