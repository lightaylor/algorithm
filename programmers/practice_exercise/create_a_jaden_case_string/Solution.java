package practice_exercise.create_a_jaden_case_string;

class Solution {
    public String solution(String s) {
        char[] c = s.toCharArray();
        c[0] = Character.toUpperCase(c[0]);

        for(int i = 1; i < c.length; i++) {
            if(c[i - 1] == ' ') {
                c[i] = Character.toUpperCase(c[i]);
            } else {
                c[i] = Character.toLowerCase(c[i]);
            }
        }

        return String.valueOf(c);
    }
}