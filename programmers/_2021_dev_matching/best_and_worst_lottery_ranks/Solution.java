package _2021_dev_matching.best_and_worst_lottery_ranks;

import java.util.HashSet;
import java.util.Set;

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        Set<Integer> winSet = new HashSet<>();
        for (int n : win_nums) winSet.add(n);

        int zeroCount = 0;
        int matchCount = 0;
        for (int lotto : lottos) {
            if (lotto == 0) zeroCount++;
            if (winSet.contains(lotto)) matchCount++;
        }

        int max = matchCount + zeroCount;
        int min = matchCount;

        return new int[]{getLottoRank(max), getLottoRank(min)};
    }

    private static int getLottoRank(int matchCount) {
        return switch (matchCount) {
            case 6 -> 1;
            case 5 -> 2;
            case 4 -> 3;
            case 3 -> 4;
            case 2 -> 5;
            default -> 6;
        };
    }
}
