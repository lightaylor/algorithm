package silver5.test_1181;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(br.readLine());
        String[] arr = new String[count];

        for(int i = 0; i < count; i++) {
            arr[i] = br.readLine();
        }

        arr = Arrays.stream(arr).distinct().toArray(String[]::new);
        Arrays.sort(arr);
        Arrays.sort(arr, (String s1, String s2) -> s1.length() - s2.length());

        for(int i = 0; i < arr.length; i++) {
            bw.write(arr[i] + "\n");
        }

        bw.close();
    }
}
