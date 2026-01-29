package programmers._01_introduction_to_coding_tests.day19.the_count_of_the_number_7;

class Solution {
    public int solution(int[] array) {
        int answer = 0;

        for(int i : array) {
            String str = String.valueOf(i);
            answer += str.chars().filter(c -> c == '7').count();
        }

        return answer;
    }
}
