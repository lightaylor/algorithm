package _01_introduction_to_coding_tests.day25.sum_of_consecutive_numbers;

class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        int start = -(total + num);

        System.out.println("start: " + start);

        for (int i = start; i <= total; i++) {
            int count = 0;
            for(int j = 0; j < num; j++) {
                count += i+j;
            }

            if (count == total) {
                for (int k = 0; k < num; k++) {
                    answer[k] = i+k;
                }
            }
        }

        return answer;
    }
}
