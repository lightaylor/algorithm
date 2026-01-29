package programmers._02_coding_test_high_score_kit.hash.unfinished_player;

import java.util.Arrays;

class Solution {

    public String solution(String[] participant, String[] completion) {
        Arrays.sort(participant);
        Arrays.sort(completion);
        String result = participant[participant.length-1];
        int j = 0;

        for(int i = 0; i < completion.length; i++) {
            if(!completion[i].equals(participant[j])) {
                result = participant[j];
                j++;
            }
            j++;
        }
        return result;
    }
}
