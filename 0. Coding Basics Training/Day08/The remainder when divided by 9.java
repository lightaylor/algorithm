import java.util.*;
import java.math.*;

class Solution {
    public int solution(String number) {
        BigInteger answer = new BigInteger(number).remainder(new BigInteger("9"));
        return answer.intValue();
    }
}
