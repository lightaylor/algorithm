package gold5.test_15686;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    static int N, M;
    static List<int[]> homes;
    static List<int[]> chickens;
    static int minCityChickenDistance;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        homes = new ArrayList<>();
        chickens = new ArrayList<>();
        minCityChickenDistance = Integer.MAX_VALUE;

        int[] nm = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        N = nm[0];
        M = nm[1];

        for (int i = 0; i < N; i++) {
            String[] line = br.readLine().split(" ");
            for (int j = 0; j < N; j++) {
                int value = Integer.parseInt(line[j]);
                if (value == 1) homes.add(new int[]{i, j});
                if (value == 2) chickens.add(new int[]{i, j});
            }
        }

        selectChickens(new ArrayList<>(), 0);

        bw.write(String.valueOf(minCityChickenDistance));
        bw.close();
    }

    static void selectChickens(List<int[]> selected, int start) {
        if (selected.size() == M) {
            int totalDistance = calculateChickenDistance(selected);
            minCityChickenDistance = Math.min(minCityChickenDistance, totalDistance);
            return;
        }

        for (int i = start; i < chickens.size(); i++) {
            selected.add(chickens.get(i));
            selectChickens(selected, i + 1);
            selected.remove(selected.size() - 1);
        }
    }

    static int calculateChickenDistance(List<int[]> selected) {
        int totalDistance = 0;
        for (int[] home : homes) {
            int minDistance = Integer.MAX_VALUE;
            for (int[] chicken : selected) {
                int distance = Math.abs(home[0] - chicken[0]) + Math.abs(home[1] - chicken[1]);
                minDistance = Math.min(minDistance, distance);
            }
            totalDistance += minDistance;
        }
        return totalDistance;
    }
}
