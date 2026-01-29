package programmers._01_introduction_to_coding_tests.day05.reverse_the_array;

class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length];
        int j = 0;
        for(int i = num_list.length - 1; i >= 0; i--) {
            answer[j++] = num_list[i];
        }
        return answer;
    }
}
