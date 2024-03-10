class Solution {
    public int solution(int M, int N) {
        int answer = 0;
        int x = M - 1;
        int y = (N-1) * M;
        answer= x + y;

        return answer;
    }
}
