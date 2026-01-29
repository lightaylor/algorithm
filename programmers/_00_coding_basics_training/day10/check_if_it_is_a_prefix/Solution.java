package programmers._00_coding_basics_training.day10.check_if_it_is_a_prefix;

class Solution {
    public int main(String my_string, String is_prefix) {
        try {
            int answer = my_string.substring(0, is_prefix.length()).equals(is_prefix) ? 1 : 0;
            return answer;
        } catch(Exception e) {
            return 0;
        }
    }
}
