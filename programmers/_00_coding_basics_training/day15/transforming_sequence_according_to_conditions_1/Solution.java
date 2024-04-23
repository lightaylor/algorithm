package _00_coding_basics_training.day15.transforming_sequence_according_to_conditions_1;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = new int[arr.length];

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] >= 50 && arr[i] % 2 == 0) {
                answer[i] = arr[i] / 2;
            } else if (arr[i] < 50 && arr[i] % 2 > 0) {
                answer[i] = arr[i] * 2;
            } else {
                answer[i] = arr[i];
            }
        }

        return answer;
    }
}
