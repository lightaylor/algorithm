package programmers._2017_kakao_code_preliminary_round.four_high_notes;

class Solution {
    private int answer;

    public int solution(int n) {
        answer = 0;
        dfs(n - 2, 2);
        return answer;
    }

    private void dfs(long curr, int plusCount) {
        if (curr < 1 || Math.log(curr) / Math.log(3) < plusCount / 2.0) return;
        if (curr == 3 && plusCount == 2) answer++;
        if (curr % 3 == 0 && plusCount >= 2) dfs(curr / 3, plusCount - 2);

        dfs(curr - 1, plusCount + 1);
    }
}
