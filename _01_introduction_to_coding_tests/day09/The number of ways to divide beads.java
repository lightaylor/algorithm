import java.lang.*;

class Solution {
    public int solution(int balls, int share) {
        double answer = Math.round(factory(balls) / (factory(balls-share) * factory(share)));
        return (int)answer;
    }

    public double factory(int n) {
        double sum = 1;

        for(int i = 2; i <= n; i++) {
            sum *= i;
        }

        return sum;
    }
}
