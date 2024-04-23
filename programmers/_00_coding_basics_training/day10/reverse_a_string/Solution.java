package _00_coding_basics_training.day10.reverse_a_string;

class Solution {
    public String main(String my_string, int s, int e) {
        String answer = my_string.substring(0, s);

        for(int i = e; i >= s; i--) {
            answer += my_string.charAt(i);
        }

        answer += my_string.substring(e+1, my_string.length());

        return answer;
    }
}
