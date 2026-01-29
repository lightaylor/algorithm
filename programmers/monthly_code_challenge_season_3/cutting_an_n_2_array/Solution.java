package programmers.monthly_code_challenge_season_3.cutting_an_n_2_array;

class Solution {
    public int[] solution(int n, long left, long right) {
        int s = (int)(right - left);
        int[] answer = new int[s + 1];
        int a = 0;
        int b = 0;

        for(int i = 0; i < answer.length; i++) {
            a = (int)((left + (long)i) % (long)n) + 1;
            b = (int)((left + (long)i) / (long)n) + 1;
            answer[i] = a < b ? b : a;
        }

        return answer;
    }
}
