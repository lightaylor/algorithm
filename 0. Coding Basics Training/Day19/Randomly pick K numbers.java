import java.util.*;

class Solution {
    public int[] solution(int[] arr, int k) {
        int[] answer = new int[k];
        Arrays.fill(answer, -1);
        arr = Arrays.stream(arr).distinct().toArray();
        int m = arr.length > k ? k : arr.length;

        for(int i = 0; i < m; i++) {
            answer[i] = arr[i];
        }

        return answer;
    }
}
