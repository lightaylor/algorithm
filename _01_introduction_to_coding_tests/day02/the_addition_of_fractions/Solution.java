package _01_introduction_to_coding_tests.day02.the_addition_of_fractions;

class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];
        answer[0] = (((denom1 * denom2) / denom1) * numer1) + (((denom1 * denom2) / denom2) * numer2);
        answer[1] = denom1 * denom2;

        int temp = eu(answer[0], answer[1]);

        if(temp > 1) {
            answer[0] /= temp;
            answer[1] /= temp;
        }

        return answer;
    }

    public int eu(int a, int b) {
        if(a % b == 0)
            return b;
        return eu(b, a % b);
    }
}
