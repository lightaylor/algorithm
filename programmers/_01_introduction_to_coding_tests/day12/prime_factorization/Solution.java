package programmers._01_introduction_to_coding_tests.day12.prime_factorization;

import java.util.*;

class Solution {
    public int[] solution(int n) {
        Map<Integer, Integer> map = new HashMap<>();
        int j = 0;
        for(int i = 2; i <= n; i++) {
            if (n % i == 0 && isPrime(i) == 1) {
                map.put(j++, i);
                n = n/i;
            }
        }
        int[] answer = new int[map.size() - 0];
        map.forEach((key, value)->{answer[key] = value;});
        return answer;
    }

    public int isPrime(int n) {
        for (int i = 2; i<=(int)Math.sqrt(n); i++) {
            if (n % i == 0) {
                return 0;
            }
        }
        return 1;
    }
}
