class Solution {
    public int solution(int a, int d, boolean[] included) {
        int init = included[0] == true ? a : 0;
        int answer = init;

        for(int i = 1; i < included.length; i++) {
            answer += included[i] == true ? a + i * d : 0;
        }

        return answer;
    }
}