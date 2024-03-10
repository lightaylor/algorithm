package _00_coding_basics_training.day12.area_of_2;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {-1};
        int start = -1;
        int end = -1;

        for(int i = 0; i < arr.length; i++) {
            if (arr[i] == 2) {
                if(start == -1) start = i;
                else end = i;
            }
        }

        if(start != -1) {
            end = end == -1 ? start : end;
            answer = new int[end + 1 - start];
            int j = 0;
            for(int i = start; i <= end; i++) {
                answer[j++] = arr[i];
            }
        }

        return answer;
    }
}
