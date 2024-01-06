import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        List<Integer> list;
        int num = 0;

        for(int[] i : commands) {
            list = new ArrayList();
            for(int j = i[0]-1; j < i[1]; j++) {
                list.add(array[j]);
            }
            list.sort(null);
            answer[num++] = list.get(i[2]-1);
        }
        return answer;
    }
}
