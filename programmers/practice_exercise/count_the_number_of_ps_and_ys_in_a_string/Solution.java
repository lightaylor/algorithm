package programmers.practice_exercise.count_the_number_of_ps_and_ys_in_a_string;

class Solution {
    boolean solution(String s) {
        String temp = s.toLowerCase();
        int y = 0;
        int p = 0;

        for (int i = 0; i < s.length(); i++) {
            if (temp.charAt(i) == 'y') {
                y++;
            }
            else if (temp.charAt(i) == 'p') {
                p++;
            }
        }

        return y == p ? true : false;
    }
}
