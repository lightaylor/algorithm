package practice_exercise.long_jump;

import java.util.List;
import java.util.ArrayList;

class Solution {
    public long solution(int n) {
        long answer = 0;
        List<Integer> list;

        for (int i = 1; i <= n; i++) {
            list = new ArrayList<Integer>();
            list.add(i);
            answer += jump(n, list);
        }

        return answer % 1234567;
    }

    public int jump(int n, List<Integer> list) {
        int count = 0;
        int remain = n - list.stream().mapToInt(Integer::intValue).sum();

        if (remain == 0) return 1;
        else if (remain < 0) return 0;

        for (int i = 1; i <= remain; i++) {
            list.add(i);
            count += jump(n, list);
        }

        return count;
    }
}
