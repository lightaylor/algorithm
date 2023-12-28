import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {-1};
        List<Integer> stk = new ArrayList<>();

        for(int i = 0; i < arr.length; i++) {
            if (stk.size() == 0) {
                stk.add(arr[i]);
            }
            else if (arr[i] == stk.get(stk.size() - 1)) {
                stk.remove(stk.size() - 1);
            } else {
                stk.add(arr[i]);
            }
        }

        if(stk.size() != 0) {
            answer = new int[stk.size()];
            for(int i = 0; i < answer.length; i++) {
                answer[i] = stk.get(i);
            }
        }

        return answer;
    }
}
