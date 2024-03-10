package _00_coding_basics_training.day15.transforming_sequence_according_to_conditions_2;

import java.util.*;

class Solution {
    public int solution(int[] arr) {
        int answer = -1;
        int[] temp = arr.clone();
        int num = 0;

        while (answer == -1) {
            for(int i = 0; i < arr.length; i++) {
                if (arr[i] >= 50 && arr[i] % 2 == 0) {
                    arr[i] /= 2;
                } else if (arr[i] < 50 && arr[i] % 2 > 0) {
                    arr[i] = arr[i] * 2 + 1;
                }
            }
            answer = Arrays.equals(arr, temp) ? num : -1;
            temp = arr.clone();
            num++;
        }
        return answer;
    }
}
