class Solution {
    public String solution(String my_string, int m, int c) {
        String answer = "";
        int n = my_string.length() / m;
        int[][] temp = new int[m][n];
        int k = 0;

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                answer += j == c - 1 ? my_string.charAt(k) : "";
                k++;
            }
        }

        return answer;
    }
}
