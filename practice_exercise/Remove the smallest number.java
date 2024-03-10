import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        int[] temp = arr.clone();

        if (arr.length < 2) {
            answer = new int[1];
            answer[0] = -1;
        } else {
            answer = new int[arr.length - 1];
            Arrays.sort(arr);
            int j = 0;
            for(int i = 0; i < arr.length; i++) {
                if (arr[0] != temp[i]) {
                    answer[j++] = temp[i];
                }
            }
        }

        return answer;
    }
}
