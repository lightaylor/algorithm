package programmers._00_coding_basics_training.day08.the_remainder_when_divided_by_9;

import java.math.*;

class Solution {
    public int solution(String number) {
        BigInteger answer = new BigInteger(number).remainder(new BigInteger("9"));
        return answer.intValue();
    }
}
