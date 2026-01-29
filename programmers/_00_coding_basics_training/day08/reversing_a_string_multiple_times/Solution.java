package programmers._00_coding_basics_training.day08.reversing_a_string_multiple_times;

class Solution {
    public String solution(String my_string, int[][] queries) {
        String answer = my_string;

        for(int[] i : queries) {
            String reverse = "";
            String temp = answer.substring(i[0], i[1] + 1);
            for(int j = temp.length() - 1; j >= 0; j--) {
                reverse += temp.charAt(j);
            }
            answer = answer.substring(0, i[0]) + reverse + answer.substring(i[1] + 1);
        }

        return answer;
    }
}
