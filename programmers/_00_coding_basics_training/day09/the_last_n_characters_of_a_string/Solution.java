package programmers._00_coding_basics_training.day09.the_last_n_characters_of_a_string;

class Solution {
    public String main(String my_string, int n) {
        String answer = my_string.substring(my_string.length() - n, my_string.length());
        return answer;
    }
}
