package baekjoon.silver.level3.test_24060;

import java.io.*;
import java.util.stream.Stream;

public class Main {
    static int count = 0;
    static int k = 0;
    static int[] tmp = new int[500_000];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");
        count = 0;
        k = Integer.parseInt(input[1]);
        int[] arr = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        merge_sort(arr, 0, arr.length - 1);
        if (count < k) {
            System.out.print("-1");
        }
    }

    static void merge_sort(int[] arr, int p, int r) {
        if (p < r) {
            int q = (p + r) / 2;
            merge_sort(arr, p, q);
            merge_sort(arr, q + 1, r);
            merge(arr, p, q, r);
        }
    }

    static void merge(int[] arr, int p, int q, int r) {
        int i = p;
        int j = q + 1;
        int t = 0;

        while (i <= q && j <= r) {
            count++;
            if (arr[i] <= arr[j]) {
                tmp[t++] = arr[i++];
            } else {
                tmp[t++] = arr[j++];
            }
            if (count == k) {
                System.out.print(tmp[t - 1]);
            }
        }

        while (i <= q) {
            count++;
            if (count == k) {
                System.out.print(arr[i]);
            }
            tmp[t++] = arr[i++];
        }

        while (j <= r) {
            count++;
            if (count == k) {
                System.out.print(arr[j]);
            }
            tmp[t++] = arr[j++];
        }

        i = p;
        t = 0;
        while (i <= r){
            arr[i++] = tmp[t++];
        }
    }
}
