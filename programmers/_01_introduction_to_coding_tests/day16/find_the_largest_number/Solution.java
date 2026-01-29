package programmers._01_introduction_to_coding_tests.day16.find_the_largest_number;

class Solution {
    public int[] solution(int[] array) {
        int[] answer = {0, 0};

        for(int i = 0; i < array.length; i++) {
            answer[0] = answer[0] > array[i] ? answer[0] : array[i];
            answer[1] = answer[0] > array[i] ? answer[1] : i;
        }

        return answer;
    }
}
