package programmers._01_introduction_to_coding_tests.day16.similarity_of_arrays;

import java.util.*;

class Solution {
    public int solution(String[] s1, String[] s2) {
        int answer = 0;

        for(String str : s1) {
            answer += Arrays.stream(s2).anyMatch(i -> i.equals(str)) ? 1 : 0;
        }
        return answer;
    }
}
