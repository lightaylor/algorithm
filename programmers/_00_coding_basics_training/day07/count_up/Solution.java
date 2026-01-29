package programmers._00_coding_basics_training.day07.count_up;

class Solution {
    public int[] main(int start_num, int end_num) {
        int[] answer = new int[end_num - start_num + 1];

        for (int i=0; i< answer.length; i++) {
            answer[i] = start_num + i;
        }

        return answer;
    }
}
