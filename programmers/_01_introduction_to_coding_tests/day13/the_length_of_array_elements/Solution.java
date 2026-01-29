package programmers._01_introduction_to_coding_tests.day13.the_length_of_array_elements;

class Solution {
    public int[] solution(String[] strlist) {
        int[] answer = new int[strlist.length];
        int i = 0;

        for(String s : strlist) {
            answer[i++] = s.length();
        }

        return answer;
    }
}
