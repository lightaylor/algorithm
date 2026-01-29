package programmers._02_coding_test_high_score_kit.greedy.gym_uniform;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        int[] total = new int[n];

        for(int i = 0; i < n; i++) {
            total[i] += 1;
        }

        for(int i : reserve) {
            total[i-1] += 1;
        }

        for(int i : lost) {
            total[i-1] -= 1;
        }

        for(int i = 0; i < n; i++) {
            if(total[i] == 0) {
                if(i > 0 && total[i-1] == 2) {
                    total[i-1] -= 1;
                    ++answer;
                } else if(i+1 < n && total[i+1] == 2) {
                    total[i+1] -= 1;
                    ++answer;
                }
            } else {
                ++answer;
            }
        }

        return answer;
    }
}
