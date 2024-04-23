package _01_introduction_to_coding_tests.day07.remove_specific_characters;

class Solution {
    public String solution(String my_string, String letter) {
        String answer = my_string.replaceAll(letter, "");
        return answer;
    }
}
