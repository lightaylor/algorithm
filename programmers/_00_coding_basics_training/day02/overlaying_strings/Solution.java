package programmers.coding_basics_training.day02.overlaying_strings;

class Solution {
    public String main(String my_string, String overwrite_string, int s) {
        String answer = my_string.substring(0, s) + overwrite_string + my_string.substring(s + overwrite_string.length());
        return answer;
    }
}
