import java.util.*;

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
