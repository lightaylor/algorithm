package _00_coding_basics_training.day10.the_first_n_characters_of_a_string;

class Solution {
    public String main(String my_string, int n) {
        String answer = my_string.substring(0, n);
        return answer;
    }
}
