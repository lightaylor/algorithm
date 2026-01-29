package programmers._02_coding_test_high_score_kit.stack_queue.stock_price;

class Solution {
    public int[] solution(int[] prices) {
        int[] answer = prices;
        int j = 1;

        for(int i = 0; i < prices.length; i++) {
            recursion(answer, i, i+1, 0);
        }
        return answer;
    }

    public void recursion(int[] answer, int init, int num , int counter) {
        if(answer.length > num && answer[init] <= answer[num]) {
            recursion(answer, init, num+1, counter+1);
        } else if(answer.length > num) {
            answer[init] = counter + 1;
        }
        else {
            answer[init] = counter;
        }
    }
}
