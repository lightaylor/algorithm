package _01_introduction_to_coding_tests.day13.remove_duplicate_characters;

class Solution {
    public String solution(String my_string) {
        String answer = my_string;

        for(int i = 0; i < answer.length() - 1; i++) {
            String c = answer.substring(i, i+1);
            String first = answer.substring(0, i+1);
            String last = answer.substring(i+1, answer.length());
            answer = first + last.replaceAll(c, "");
        }

        return answer;
    }
}
