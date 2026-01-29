package programmers.practice_exercise.handling_strings_basic;

class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        char[] c = s.toCharArray();

        for (int i = 0; i < c.length; i++) {
            if ((int)c[i] > 64 || !(c.length == 4 || c.length == 6)) {
                answer = false;
            }
        }

        return answer;
    }
}
