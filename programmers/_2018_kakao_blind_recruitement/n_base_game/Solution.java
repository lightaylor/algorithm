package programmers._2018_kakao_blind_recruitement.n_base_game;

class Solution {
    public String solution(int n, int t, int m, int p) {
        StringBuilder stream = new StringBuilder();

        for (int num = 0; stream.length() < t * m; num++) {
            stream.append(Integer.toString(num, n).toUpperCase());
        }

        StringBuilder ans = new StringBuilder();
        int start = p - 1;
        for (int i = 0; i < t; i++) {
            ans.append(stream.charAt(start + i * m));
        }

        return ans.toString();
    }
}
