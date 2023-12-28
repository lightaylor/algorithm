import java.util.*;

class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        int[] temp = emergency.clone();
        Arrays.sort(temp);

        for(int i = 0; i < temp.length; i++) {
            answer[i] = temp.length - Arrays.binarySearch(temp, emergency[i]);
        }
        return answer;
    }
}
