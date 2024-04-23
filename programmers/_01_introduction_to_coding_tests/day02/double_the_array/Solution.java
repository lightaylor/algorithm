package _01_introduction_to_coding_tests.day02.double_the_array;

class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = numbers;

        for(int i = 0; i < answer.length; i++) {
            answer[i] = answer[i] * 2;
        }

        return answer;
    }
}
