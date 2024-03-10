package _00_coding_basics_training.day20.performing_different_operations_based_on_the_length_of_the_array;

class Solution {
    public int[] solution(int[] arr, int n) {
        int[] answer = arr;

        for(int i = 0; i < arr.length; i++) {
            if(arr.length % 2 == 0) {
                answer[i] = i % 2 == 0 ? arr[i] : arr[i] + n;
            } else {
                answer[i] = i % 2 != 0 ? arr[i] : arr[i] + n;
            }
        }

        return answer;
    }
}
