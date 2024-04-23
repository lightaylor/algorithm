package _00_coding_basics_training.day17.find_the_longest_substring_ending_with_a_specific_string;

class Solution {
    public String solution(String myString, String pat) {
        String answer = myString.substring(0, myString.lastIndexOf(pat) + pat.length());
        return answer;
    }
}
