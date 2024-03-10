class Solution {
    public int solution(int[] array, int height) {
        int answer = 0;

        for(int i : array) {
            answer += height < i ? 1 : 0;
        }

        return answer;
    }
}
