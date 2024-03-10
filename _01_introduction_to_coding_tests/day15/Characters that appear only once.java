import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        char[] s_list = s.toCharArray();
        Arrays.sort(s_list);

        for(char ch : s_list) {
            int i = (int)s.chars().filter(c -> c == ch).count();
            if (i == 1) answer += ch;
        }

        return answer;
    }
}
