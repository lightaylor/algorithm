package _00_coding_basics_training.day17.count_how_many_times_a_string_appears;

class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;

        for(int i = 0; i <= myString.length() - pat.length(); i++) {
            answer += myString.substring(i, i + pat.length()).equals(pat) ? 1 : 0;
        }

        return answer;
    }
}
