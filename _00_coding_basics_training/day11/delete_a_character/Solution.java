package _00_coding_basics_training.day11.delete_a_character;

class Solution {
    public String solution(String my_string, int[] indices) {
        for(int i : indices) {
            char c = my_string.charAt(i);
            my_string = my_string.substring(0, i) + " " + my_string.substring(i+1, my_string.length());
        }

        return my_string.replace(" ", "");
    }
}
