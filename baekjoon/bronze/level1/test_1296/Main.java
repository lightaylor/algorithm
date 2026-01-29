package baekjoon.bronze.level1.test_1296;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String yeondu = sc.nextLine();

        int max = 0;
        String name = "";
        char[] LOVE = "LOVE".toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            String target = sc.nextLine();

            for (char c : LOVE) {
                String yeonduTemp = yeondu.replaceAll(String.valueOf(c),
                    "");
                String targetTemp = target.replaceAll(String.valueOf(c), "");
                map.put(c, yeondu.length() + target.length() - yeonduTemp.length() - targetTemp.length());
            }

            int result = getResult(map);
            if (name.isEmpty() || max < result) {
                max = result;
                name = target;
            } else if (max == result && name.compareTo(target) > -1) {
                name = target;
            }

        }
        System.out.print(name);
    }

    private static int getResult(Map<Character, Integer> map) {
        int L = map.get('L');
        int O = map.get('O');
        int V = map.get('V');
        int E = map.get('E');

        return ((L + O) * (L + V) * (L + E) * (O + V) * (O + E) * (V + E)) % 100;
    }
}
