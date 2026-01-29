package programmers._00_coding_basics_training.day25.make_it_into_a_square;

class Solution {
    public int[][] solution(int[][] arr) {
        int[][] answer = {};
        int le = arr.length > arr[0].length ? arr.length : arr[0].length;

        answer = new int[le][le];
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                answer[i][j] = arr[i][j];
            }
        }

        return answer;
    }
}
