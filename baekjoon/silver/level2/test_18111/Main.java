package silver.level2.test_18111;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split(" ");
        int N = Integer.parseInt(arr[0]);
        int M = Integer.parseInt(arr[1]);
        int B = Integer.parseInt(arr[2]);

        int[] heightCount = new int[257];
        int minHeight = 256, maxHeight = 0;

        for (int j = 0; j < N; j++) {
            arr = br.readLine().split(" ");
            for (int i = 0; i < M; i++) {
                int height = Integer.parseInt(arr[i]);
                heightCount[height]++;
                minHeight = Math.min(minHeight, height);
                maxHeight = Math.max(maxHeight, height);
            }
        }

        int minTime = Integer.MAX_VALUE;
        int optimalHeight = 0;

        for (int targetHeight = minHeight; targetHeight <= maxHeight; targetHeight++) {
            int addBlocks = 0;
            int removeBlocks = 0;

            for (int currentHeight = minHeight; currentHeight <= maxHeight; currentHeight++) {
                int diff = currentHeight - targetHeight;

                if (diff > 0) {
                    removeBlocks += diff * heightCount[currentHeight];
                } else if (diff < 0) {
                    addBlocks -= diff * heightCount[currentHeight];
                }
            }

            if (removeBlocks + B < addBlocks) {
                continue;
            }

            int totalTime = removeBlocks * 2 + addBlocks;

            if (totalTime < minTime || (totalTime == minTime && targetHeight > optimalHeight)) {
                minTime = totalTime;
                optimalHeight = targetHeight;
            }
        }

        System.out.print(minTime + " " + optimalHeight);
    }
}
