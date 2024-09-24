package gold4.test_14500;

import java.io.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] size = br.readLine().split(" ");
        int n = Integer.parseInt(size[0]);
        int m = Integer.parseInt(size[1]);
        int[][] page = new int[n][m];
        int[][][] tetromino = {
                {{0, 1}, {0, 2}, {0, 3}},
                {{1, 0}, {2, 0}, {3, 0}},
                {{1, 0}, {0, 1}, {1, 1}},
                {{0, 1}, {0, 2}, {1, 2}},
                {{0, 1}, {0, 2}, {-1, 2}},
                {{0, 1}, {1, 1}, {2, 1}},
                {{0, 1}, {-1, 1}, {-2, 1}},
                {{-1, 0}, {-1, 1}, {-1, 2}},
                {{1, 0}, {1, 1}, {1, 2}},
                {{1, 0}, {2, 0}, {2, 1}},
                {{-1, 0}, {-2, 0}, {-2, 1}},
                {{0, 1}, {-1, 1}, {-1, 2}},
                {{0, 1}, {1, 1}, {1, 2}},
                {{1, 0}, {1, 1}, {2, 1}},
                {{1, 0}, {0, 1}, {-1, 1}},
                {{-1, 1}, {0, 1}, {1, 1}},
                {{1, 0}, {2, 0}, {1, 1}},
                {{0, 1}, {0, 2}, {-1, 1}},
                {{0, 1}, {0, 2}, {1, 1}},
        };

        for (int i = 0; i < n; i++) {
            page[i] = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        }

        int max = 0;
        boolean check;
        for (int point_x = 0; point_x < n; point_x++) {
            for (int point_y = 0; point_y < m; point_y++) {
                for (int[][] blockList : tetromino) {
                    check = true;
                    int sum = page[point_x][point_y];
                    for (int[] block : blockList) {
                        int x = block[0] + point_x;
                        int y = block[1] + point_y;
                        if (0 <= x && x < n && 0 <= y && y < m) {
                            sum += page[x][y];
                        } else {
                            check = false;
                            break;
                        }
                    }
                    if (check) {
                        max = Math.max(max, sum);
                    }
                }
            }
        }
        bw.write(String.valueOf(max));
        bw.close();
    }
}
