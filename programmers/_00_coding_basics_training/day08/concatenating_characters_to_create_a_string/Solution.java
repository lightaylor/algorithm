package _00_coding_basics_training.day08.concatenating_characters_to_create_a_string;

class Solution {
    public String solution(String my_string, int[] index_list) {
        String answer = "";

        for(int i = 0; i < index_list.length; i++) {
            answer = answer + my_string.charAt(index_list[i]);
        }

        return answer;
    }
}
