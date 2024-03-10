package _01_introduction_to_coding_tests.day05.getting_a_discount_at_a_clothing_store;

import java.lang.Math;

class Solution {
    public int solution(int price) {
        int answer = price;

        if(price >= 500000) answer = (int)(price * 0.8);
        else if (price >= 300000) answer = (int)(price * 0.9);
        else if(price >= 100000) answer = (int)(price * 0.95);

        return answer;
    }
}
