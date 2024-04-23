package _01_introduction_to_coding_tests.day10.rotate_the_array;

class Solution {
    public int[] solution(int[] numbers, String direction) {
        int[] answer = new int[numbers.length];
        int j = 0;

        if (direction.equals("right")) {
            answer[j++] = numbers[numbers.length-1];
            for(int i = 0; i < numbers.length - 1; i++) {
                answer[j++] = numbers[i];
            }
        } else {
            for(int i = 1; i < numbers.length; i++) {
                answer[j++] = numbers[i];
            }
            answer[j++] = numbers[0];
        }

        return answer;
    }
}
