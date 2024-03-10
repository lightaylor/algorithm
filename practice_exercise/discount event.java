import java.util.*;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        Map<String, Integer> map = new HashMap<>();
        int answer = discount.length - 9;
        int value = 0;
        int idx = 0;

        while (idx + 10 <= discount.length) {
            String[] temp = Arrays.copyOfRange(discount, idx, idx + 10);
            for (int j = 0; j < want.length; j++) {
                int count = Collections.frequency(Arrays.asList(temp), want[j]);
                if (count != number[j]) {
                    answer--;
                    break;
                }
            }
            idx++;
        }

        return answer;
    }
}
