package programmers.monthly_code_challenge_season_1.pick_two_and_add;

import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        int[] arr = new int[fact(numbers.length - 1)];
        int k = 0;

        for(int i = 0; i < numbers.length; i++) {
            for(int j = i + 1; j < numbers.length; j++) {
                arr[k++] = numbers[i] + numbers[j];
            }
        }

        Arrays.sort(arr);
        return Arrays.stream(arr).distinct().toArray();
    }

    private int fact(int n) {
        if (n <= 1) return n;
        else return fact(n-1) + n;
    }
}
