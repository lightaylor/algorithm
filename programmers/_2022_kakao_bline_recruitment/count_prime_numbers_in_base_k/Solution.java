package programmers._2022_kakao_bline_recruitment.count_prime_numbers_in_base_k;

class Solution {
    public int solution(int n, int k) {
        int answer = 0;

        String string = Long.toString(n, k);
        String[] numbers = string.split("0+");

        for (String number : numbers) {
            if (number.isEmpty()) continue;
            if (isPrime(Long.parseLong(number))) answer++;
        }
        return answer;
    }

    private boolean isPrime(long n) {
        if (n < 2) return false;
        if (n % 2 == 0) return n == 2;
        for (long i = 3; i * i <= n; i++) {
            if (n % i == 0) return false;
        }

        return true;
    }
}
