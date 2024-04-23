package _00_coding_basics_training.day17.split_by_whitespace_2;

class Solution {
    public String[] solution(String my_string) {
        String temp = my_string.strip();

        while(temp.contains("  ")) {
            temp = temp.replaceAll("  ", " ");
        }

        return temp.split(" ");
    }
}
