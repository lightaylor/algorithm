package _01_introduction_to_coding_tests.day18.sorting_strings_2;

import java.util.*;

class Solution {
    public String solution(String my_string) {
        String answer = my_string.toLowerCase();
        char[] ch = answer.toCharArray();
        Arrays.sort(ch);
        return String.valueOf(ch);
    }
}
