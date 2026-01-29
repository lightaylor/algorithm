package programmers._00_coding_basics_training.day09.concatenating_substrings_to_form_a_string;

class Solution {
    public String main(String[] my_strings, int[][] parts) {
        String answer = "";
        for(int i = 0; i < my_strings.length; i++) {
            answer += my_strings[i].substring(parts[i][0], parts[i][1]+1);
        }
        return answer;
    }
}
