package practice_exercise.string_splitting;

class Solution {
    public int solution(String s) {
        int answer = 0;
        int idx = 0;

        while(idx < s.length()) {
            char x = s.charAt(idx);
            int countX = 1;
            int countOther = 0;
            idx++;

            while(idx < s.length()) {
                if (s.charAt(idx) == x) {
                    countX++;
                } else {
                    countOther++;
                }
                idx++;

                if (countX == countOther) {
                    break;
                }
            }
            answer++;
        }

        return answer;
    }
}
