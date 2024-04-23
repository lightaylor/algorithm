package _01_introduction_to_coding_tests.day21.alien_language_dictionary;

class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer = 2;

        for(String s : dic) {
            int count = 0;
            for(String sp : spell) {
                if(s.contains(sp)) count++;
            }
            if(count == spell.length) return 1;
        }

        return answer;
    }
}
