package gold.level4.test_14500_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.StringTokenizer;
import java.util.stream.Stream;

public class Main {
    private static final List<int[][]> BLOCKS = List.of(
        new int[][]{{1, 0}, {2, 0}, {3, 0}},
        new int[][]{{0, 1}, {0, 2}, {0, 3}},
        new int[][]{{1, 0}, {0, 1}, {1, 1}},
        new int[][]{{0, 1}, {0, 2}, {1, 2}},
        new int[][]{{0, 1}, {0, 2}, {-1, 2}},
        new int[][]{{0, 1}, {1, 1}, {2, 1}},
        new int[][]{{0, 1}, {-1, 1}, {-2, 1}},
        new int[][]{{-1, 0}, {-1, 1}, {-1, 2}},
        new int[][]{{1, 0}, {1, 1}, {1, 2}},
        new int[][]{{1, 0}, {2, 0}, {2, 1}},
        new int[][]{{-1, 0}, {-2, 0}, {-2, 1}},
        new int[][]{{0, 1}, {-1, 1}, {-1, 2}},
        new int[][]{{0, 1}, {1, 1}, {1, 2}},
        new int[][]{{1, 0}, {1, 1}, {2, 1}},
        new int[][]{{1, 0}, {0, 1}, {-1, 1}},
        new int[][]{{-1, 1}, {0, 1}, {1, 1}},
        new int[][]{{1, 0}, {2, 0}, {1, 1}},
        new int[][]{{0, 1}, {0, 2}, {-1, 1}},
        new int[][]{{1, 0}, {2, 0}, {1, 1}}
    );

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[][] tetrino = new int[N][];
        for (int i = 0; i < N; i++) {
            tetrino[i] = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        }

        int answer = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                for (int[][] block : BLOCKS) {
                    boolean check = true;
                    int sum = tetrino[i][j];
                    for (int[] b : block) {
                        int x = b[0] + i;
                        int y = b[1] + j;
                        if (0 <= x && x < N && 0 <= y && y < M) {
                            sum += tetrino[x][y];
                        } else {
                            check = false;
                            break;
                        }
                    }
                    if (check) {
                        answer = Math.max(answer, sum);
                    }
                }
            }
        }
        System.out.print(answer);
    }
}
