package programmers.monthly_code_challenge_season_3.finding_numbers_with_a_remainder_of;

class Solution {
    public int solution(int n) {
        for(int i = 1; i < n; i++) {
            if (n % i == 1) {
                return i;
            }
        }
        return n+1;
    }
}
