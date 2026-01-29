package programmers._01_introduction_to_coding_tests.day22.identifying_finite_decimals;

import java.lang.Math;

class Solution {
    public int solution(int a, int b) {
        int mo = a;
        int de = b;

        for (int i = 2; i <= b; i++) {
            if (mo % i == 0 && de % i == 0) {
                mo = mo / i;
                de = de / i;
            }
        }

        if (checkFactorization(de)) {
            return 1;
        }
        return 2;
    }

    private boolean checkFactorization (int de) {
        boolean[] isPrime = new boolean[de + 1];

        for (int i = 2; i * i <= de; i++) {
            if (!isPrime[i]) {
                for (int j = i * i; j <= de; j += i) {
                    isPrime[j] = true;
                }
            }
        }

        for (int i = 2; i <= de; i++) {
            if (!isPrime[i] && de % i == 0 && !(i == 2 || i == 5)) {
                return false;
            }
        }
        return true;
    }
}
