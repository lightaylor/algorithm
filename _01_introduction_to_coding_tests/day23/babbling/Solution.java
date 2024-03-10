package _01_introduction_to_coding_tests.day23.babbling;

class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] words = {"aya", "ye", "woo", "ma"};
        String temp = "";

        for (int i = 0; i < babbling.length; i++) {
            temp = babbling[i];
            for (int j = 0; j < words.length; j++) {
                if (babbling[i].contains(words[j])) {
                    temp = temp.replaceFirst(words[j], "");
                }
            }

            if (temp.equals("")) {
                answer += 1;
            }
        }

        return answer;
    }
}
