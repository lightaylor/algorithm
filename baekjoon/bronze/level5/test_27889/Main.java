package baekjoon.bronze.level5.test_27889;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("NLCS", "North London Collegiate School");
        map.put("BHA", "Branksome Hall Asia");
        map.put("KIS", "Korea International School");
        map.put("SJA", "St. Johnsbury Academy");

        Scanner sc = new Scanner(System.in);
        String key = sc.nextLine();
        System.out.print(map.get(key));
    }
}
