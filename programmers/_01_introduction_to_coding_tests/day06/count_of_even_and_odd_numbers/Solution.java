package programmers._01_introduction_to_coding_tests.day06.count_of_even_and_odd_numbers;

class Solution {
    public int[] solution(int[] num_list) {
        int even = 0;
        int odd = 0;

        for(int i : num_list) {
            if (i % 2 == 0) even++;
            else odd++;
        }
        int[] answer= {even, odd};

        return answer;
    }
}
