import java.util.Arrays;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        int idx;

        for(int i = 0; i < photo.length; i++) {
            for(int j = 0; j < photo[i].length; j++) {
                idx = Arrays.asList(name).indexOf(photo[i][j]);

                if (idx > -1) {
                    answer[i] += yearning[idx];
                }
            }
        }

        return answer;
    }
}
