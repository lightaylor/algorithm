package _01_introduction_to_coding_tests.day24.the_number_of_occurrences_of_k;

class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;

        for(int a = i; a <= j; a++) {
            String str = String.valueOf(a);
            answer += (int)str.chars().filter(c -> c == (char)(k+'0')).count();
        }
        return answer;
    }
}
