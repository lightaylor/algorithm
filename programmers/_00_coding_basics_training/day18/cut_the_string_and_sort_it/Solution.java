package programmers._00_coding_basics_training.day18.cut_the_string_and_sort_it;

import java.util.*;

class Solution {
    public String[] solution(String myString) {
        String[] answer = myString.split("x");
        Arrays.sort(answer);
        answer = Arrays.stream(answer).filter(element -> element.length() != 0).toArray(String[]::new);
        return answer;
    }
}
