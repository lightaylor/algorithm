import java.util.*;

class Solution {
    public int[] solution(String my_string) {
        String str = my_string.replaceAll("[^0-9]", "");
        int[] answer = new int[str.length()];
        int i = 0;

        for(char c : str.toCharArray()) {
            answer[i++] = (int)c - '0';
        }
        Arrays.sort(answer);

        return answer;
    }
}
