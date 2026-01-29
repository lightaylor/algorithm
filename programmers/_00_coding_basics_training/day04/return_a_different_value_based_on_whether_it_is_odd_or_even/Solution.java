package programmers.coding_basics_training.day04.return_a_different_value_based_on_whether_it_is_odd_or_even;

class Solution {
    public int solution(int n) {
        int answer = 0;

        if(n % 2 == 0) {
            for(int i = 2; i <= n; i+=2) {
                answer += i * i;
            }
        } else {
            for(int i = 1; i <= n; i+=2) {
                answer += i;
            }
        }

        return answer;
    }
}
