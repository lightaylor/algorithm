import java.util.*;

class Solution {
    public String[] solution(String[] picture, int k) {
        String[] answer = new String[picture.length * k];
        Arrays.fill(answer, "");
        int j = 0;

        for(String str : picture) {
            char[] list = str.toCharArray();
            for(char c : list) {
                for(int i = 0; i < k; i++) {
                    answer[j+i] += String.valueOf(c).repeat(k);
                }
            }
            j += k;
        }

        return answer;
    }
}
