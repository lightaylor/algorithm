package _01_introduction_to_coding_tests.day09.the_number_of_ways_to_divide_beads;

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
