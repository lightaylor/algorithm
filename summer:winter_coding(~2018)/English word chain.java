import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        List<String> arr = new ArrayList<>();
        arr.add(words[0]);

        for (int i = 1; i < words.length; i++) {
            if (arr.contains(words[i]) || (words[i-1].charAt(words[i-1].length() - 1) != words[i].charAt(0))) {
                answer[0] = i%n + 1;
                answer[1] = i/n + 1;
                break;
            }
            arr.add(words[i]);
        }

        return answer;
    }
}
