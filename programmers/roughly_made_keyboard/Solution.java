import java.util.*;

class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];

        Map<Character, Integer> map = new HashMap<>();
        for (String key : keymap) {
            for (int i = 0; i < key.length(); i++) {
                char c = key.charAt(i);
                map.merge(c, i + 1, Math::min);
            }
        }

        for (int i = 0; i < targets.length; i++) {
            for (char c : targets[i].toCharArray()) {
                if (!map.containsKey(c)) {
                    answer[i] = -1;
                    break;
                }
                answer[i] += map.get(c);
            }
        }
        return answer;
    }
}
