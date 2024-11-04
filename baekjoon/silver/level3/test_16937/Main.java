package silver.level3.test_16937;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(br.readLine());

        List<Pair> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] input = br.readLine().split(" ");
            int a = Integer.parseInt(input[0]);
            int b = Integer.parseInt(input[1]);

            if (Math.max(x, y) >= Math.max(a, b)) {
                list.add(new Pair(Math.max(a, b), Math.min(a, b)));
            }
        }

        int answer = 0;
        Pair board = new Pair(Math.max(x, y), Math.min(x, y));
        for (int i = 0; i < list.size(); i++) {
            Pair current = list.get(i);
            for (int j = i + 1; j < list.size(); j++) {
                Pair target = list.get(j);
                answer = Math.max(answer, getMaxArea(board, current, target));
            }
        }
        System.out.print(answer);
    }

    static int getMaxArea(Pair board, Pair current, Pair target) {
        int maxArea = 0;

        int[][] cases = {
            {current.x + target.x, Math.max(current.y, target.y)},
            {Math.max(current.x, target.x), current.y + target.y},
            {current.x + target.y, Math.max(current.y, target.x)},
            {Math.max(current.x, target.y), current.y + target.x}
        };

        for (int[] c : cases) {
            if ((c[0] <= board.x && c[1] <= board.y) || (c[1] <= board.x && c[0] <= board.y)) {
                maxArea = Math.max(maxArea, current.getArea() + target.getArea());
            }
        }

        return maxArea;
    }

    static class Pair {
        int x;
        int y;

        public Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getArea() {
            return x * y;
        }
    }
}
