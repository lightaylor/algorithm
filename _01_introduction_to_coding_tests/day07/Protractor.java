class Solution {
    public int solution(int angle) {
        int answer = 0;

        if (0 < angle && angle <= 90) {
            answer = angle == 90 ? 2 : 1;
        } else {
            answer = angle == 180 ? 4 : 3;
        }

        return answer;
    }
}
