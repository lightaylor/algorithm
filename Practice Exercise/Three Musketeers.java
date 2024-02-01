import java.util.*;

class Solution {
    public int solution(int[] number) {
        int answer = 0;
        int left = 0;
        int right = number.length - 1;
        Arrays.sort(number);

        for (int i = 0; i < number.length - 2; i++) {
            left = i+1;
            right = number.length - 1;
            while(left < right) {
                if (number[right] + number[i] + number[left] == 0) {
                    answer++;
                    left++;
                    right--;
                } else if (number[right] + number[i] + number[left] > 0) {
                    right--;
                } else {
                    left++;
                }
            }
        }

        return answer;
    }
}
