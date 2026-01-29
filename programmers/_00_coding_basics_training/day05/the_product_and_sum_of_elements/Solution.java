package programmers.coding_basics_training.day05.the_product_and_sum_of_elements;

class Solution {
    public int solution(int[] num_list) {
        int sum = 0;
        int mul = 1;

        for(int i = 0; i < num_list.length; i++) {
            sum += num_list[i];
            mul *= num_list[i];
        }

        return mul > sum * sum ? 0 : 1;
    }
}
