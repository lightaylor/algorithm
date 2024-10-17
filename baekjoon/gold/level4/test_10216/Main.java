package gold.level4.test_10216;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
    private static int[] groups;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            int N = Integer.parseInt(br.readLine());
            int[][] circle = new int[N][3];
            groups = new int[N];

            for (int j = 0; j < N; j++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                circle[j][0] = Integer.parseInt(st.nextToken());
                circle[j][1] = Integer.parseInt(st.nextToken());
                circle[j][2] = Integer.parseInt(st.nextToken());

                groups[j] = j;
            }

            for (int j = 0; j < N; j++) {
                for (int k = j + 1; k < N; k++) {
                    int x = circle[j][0] - circle[k][0];
                    int y = circle[j][1] - circle[k][1];
                    int r = circle[j][2] + circle[k][2];

                    if (Math.pow(x, 2) + Math.pow(y, 2) <= Math.pow(r, 2)) {
                        union(j, k);
                    }
                }
            }

            Set<Integer> uniqueGroups = new HashSet<>();
            for (int j = 0; j < N; j++) {
                uniqueGroups.add(find(j));
            }
            System.out.println(uniqueGroups.size());
        }
    }

    private static int find(int x) {
        if (x == groups[x]) {
            return x;
        }
        return groups[x] = find(groups[x]);
    }

    private static void union(int x, int y) {
        int rootX = find(x);
        int rootY = find(y);
        if (rootX != rootY) {
            groups[rootY] = rootX;
        }
    }
}
