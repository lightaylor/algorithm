package programmers._01_introduction_to_coding_tests.day17.sum_of_digits;

class Solution {
    public int solution(int n) {
        int answer = 0;
        String str = String.valueOf(n);

        for(char c : str.toCharArray()) {
            answer += Character.getNumericValue(c);
        }

        return answer;
    }
}
