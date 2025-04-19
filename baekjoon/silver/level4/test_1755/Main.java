package silver.level4.test_1755;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = sc.nextLine().split(" ");
        String[] num = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

        Map<String, Integer> map = new TreeMap<>();
        for (int i = Integer.parseInt(arr[0]); i <= Integer.parseInt(arr[1]); i++) {
            StringBuilder sb = new StringBuilder();
            char[] cArr = String.valueOf(i).toCharArray();
            for (char c : cArr) {
                sb.append(num[Character.getNumericValue(c)]);
            }
            map.put(sb.toString(), i);
            sb.setLength(0);
        }

        int count = 0;
        StringBuilder sb = new StringBuilder();
        for (int i : map.values()) {
            sb.append(i).append(" ");
            count++;
            if (count == 10) {
                System.out.println(sb.toString().trim());
                sb.setLength(0);
                count = 0;
            }
        }
        System.out.println(sb.toString().trim());
    }
}
