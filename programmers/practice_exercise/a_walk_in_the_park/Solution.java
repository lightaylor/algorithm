package practice_exercise.a_walk_in_the_park;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] solution(String[] park, String[] routes) {
        Map<Character, int[]> map = new HashMap<>();
        map.put('N', new int[]{-1, 0});
        map.put('E', new int[]{0, 1});
        map.put('W', new int[]{0, -1});
        map.put('S', new int[]{1, 0});

        int W = park.length;
        int H = park[0].length();
        int x = 0, y = 0;

        for (int i = 0; i < W; i++) {
            for (int j = 0; j < H; j++) {
                if (park[i].charAt(j) == 'S') {
                    x = i;
                    y = j;
                }
            }
        }

        for (String route : routes) {
            String[] r = route.split(" ");
            char dir = r[0].charAt(0);
            int dist = Integer.parseInt(r[1]);

            int nx = x;
            int ny = y;
            boolean valid = true;
            while (dist-- > 0) {
                int[] move = map.get(dir);
                nx += move[0];
                ny += move[1];

                if (nx < 0 || nx >= W || ny < 0 || ny >= H || park[nx].charAt(ny) == 'X') {
                    valid = false;
                    break;
                }
            }

            if (valid) {
                x = nx;
                y = ny;
            }
        }

        return new int[]{x, y};
    }
}
