package programmers._01_introduction_to_coding_tests.day12.remove_vowels;

class Solution {
    public String solution(String my_string) {
        String answer = my_string.replaceAll("[aeiou]", "");
        return answer;
    }
}
