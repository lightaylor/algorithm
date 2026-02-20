package programmers.brute_force_search.vowel_dictionary;

class Solution {
    public int solution(String word) {
        int answer = 0;
        int[] weight = {781, 156, 31, 6, 1};
        String vowels = "AEIOU";

        for (int i = 0; i < word.length(); i++) {
            answer += vowels.indexOf(word.charAt(i)) * weight[i] + 1;
        }

        return answer;
    }
}
