package programmers.practice_exercise.least_common_multiple_of_n_numbers;

class Solution {
    public int solution(int[] arr) {
        int answer = arr[0];

        for (int i = 1; i < arr.length; i++) {
            answer = (answer * arr[i]) / gcd(answer, arr[i]);
        }

        return answer;
    }

    private int gcd (int a, int b) {
        int r;
        while (b != 0) {
            r = a % b;
            a = b;
            b = r;
        }
        return a;
    }
}
