package programmers._00_coding_basics_training.day20.make_the_length_of_the_array_a_power_of_2;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        int n = arr.length;
        while ((n & (n-1)) != 0) {
            n ++;
        }
        answer = new int[n];

        for(int i = 0; i < arr.length; i++) {
            answer[i] = arr[i];
        }

        return answer;
    }
}
