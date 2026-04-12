package programmers.monthly_code_challenge_season_2.differ_in_at_most_2_bits;

class Solution {
    public long[] solution(long[] numbers) {
        long[] answer = new long[numbers.length];

        for (int idx = 0; idx < numbers.length; idx++) {
            long n = numbers[idx];
            long minVal = Long.MAX_VALUE;

            for (int i = 0; i < 62; i++) {
                long c1 = n ^ (1L << i);
                if (c1 > n) minVal = Math.min(minVal, c1);

                for (int j = i + 1; j < 62; j++) {
                    long c2 = n ^ (1L << i) ^ (1L << j);
                    if (c2 > n) minVal = Math.min(minVal, c2);
                }
            }

            answer[idx] = minVal;
        }
        return answer;
    }
}