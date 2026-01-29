package programmers.monthly_code_challenge_season_1.reverse_ternary;

class Solution {
    public int solution(int n) {
        String s = Integer.toString(n, 3);
        String temp = "";

        for(int i = s.length() - 1; i >= 0; i--) {
            temp += s.charAt(i);
        }
        return Integer.parseInt(temp, 3);
    }
}
