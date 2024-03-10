import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int[] answer = Arrays.stream(nums).distinct().toArray();

        if (answer.length > nums.length/2) {
            return nums.length/2;
        } else {
            return answer.length;
        }
    }
}
