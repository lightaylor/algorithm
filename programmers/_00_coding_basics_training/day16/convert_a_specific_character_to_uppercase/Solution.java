package _00_coding_basics_training.day16.convert_a_specific_character_to_uppercase;

class Solution {
    public String solution(String my_string, String alp) {
        String answer = my_string.replace(alp, alp.toUpperCase());
        return answer;
    }
}
