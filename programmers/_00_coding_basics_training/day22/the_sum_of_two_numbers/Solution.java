package programmers._00_coding_basics_training.day22.the_sum_of_two_numbers;

import java.math.*;

class Solution {
    public String solution(String a, String b) {
        BigInteger c = new BigInteger(a);
        BigInteger d = new BigInteger(b);
        String answer = String.valueOf(c.add(d));

        return answer;
    }
}
