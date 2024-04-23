package _00_coding_basics_training.day11.counting_the_number_of_characters;

class Solution {
    public int[] solution(String my_string) {
        int[] answer = new int[52];

        for (char c : my_string.toCharArray()) {
            if ((int)c > 90) {
                answer[(int)c - 71] += 1;
            } else {
                answer[(int)c - 65] += 1;
            }
        }

        return answer;
    }
}
