package programmers._2024_kakao_winter_internship;

import java.util.*;

class Solution {
    public int solution(String[] friends, String[] gifts) {
        int size = friends.length;
        int[] answer = new int[size];
        int[][] arr = new int[size][size];
        int[] gift_score = new int[size];

        for (int i = 0; i < gifts.length; i++) {
            String[] str = gifts[i].split(" ");
            int giver = Arrays.asList(friends).indexOf(str[0]);
            int taker = Arrays.asList(friends).indexOf(str[1]);
            arr[giver][taker]++;
            gift_score[giver]++;
            gift_score[taker]--;
        }

        for (int i = 0; i < size - 1; i++) {
            for (int j = i + 1; j < size; j++) {
                if (arr[i][j] == arr[j][i]) {
                    if (gift_score[i] > gift_score[j]) answer[i]++;
                    else if (gift_score[i] < gift_score[j]) answer[j]++;
                } else {
                    answer[arr[i][j] > arr[j][i] ? i: j]++;
                }
            }
        }
        return Arrays.stream(answer).max().getAsInt();
    }
}
