class Solution {
    public int solution(int[] numbers, int k) {
        int max = ((k - 1) * 2 - 1) % numbers.length;
        int answer = numbers[max + 1];

        return answer;
    }
}
