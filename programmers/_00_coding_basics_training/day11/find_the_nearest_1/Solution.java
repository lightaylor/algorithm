package programmers._00_coding_basics_training.day11.find_the_nearest_1;

class Solution {
    public int solution(int[] arr, int idx) {
        int answer = -1;

        for(int i = idx; i < arr.length; i++) {
            if(arr[i] == 1) return i;
        }

        return answer;
    }
}
