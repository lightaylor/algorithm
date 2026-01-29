package programmers._00_coding_basics_training.day19.three_delimiters;

import java.util.*;

class Solution {
    public String[] solution(String myStr) {
        String[] answer = myStr.replaceAll("a", " ").replaceAll("b", " ").replaceAll("c", " ").split(" ");
        List<String> list = new ArrayList<String>();

        for(String s : answer) {
            if(s.length() > 0) list.add(s);
        }
        if (list.size() == 0) list.add("EMPTY");

        answer = new String[list.size()];
        for(int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}
