package practice_exercise.sum_of_integers_between_two_numbers;

class Solution {
    public long solution(int a, int b) {
        long answer = 0;

        if (a > b) {
            int temp = b;
            b = a;
            a = temp;
        }

        for (int i = a; i <= b; i++) {
            answer += i;
        }

        return answer;
    }
}