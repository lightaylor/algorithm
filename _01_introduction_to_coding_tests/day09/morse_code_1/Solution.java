package _01_introduction_to_coding_tests.day09.morse_code_1;

import java.util.*;

class Solution {
    public String solution(String letter) {
        String answer = "";
        Map<String, String> morseMap = new HashMap<>();
        String[] mors = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};
        int i = 97;

        for(String str : mors) {
            morseMap.put(str, String.valueOf((char)i++));
        }

        for(String c : letter.split(" ")) {
            answer += morseMap.get(c);
        }

        return answer;
    }
}
