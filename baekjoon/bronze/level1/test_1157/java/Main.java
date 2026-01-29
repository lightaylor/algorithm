package baekjoon.bronze.level1.test_1157.java;

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine().toUpperCase();
        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < input.length(); i++) {
            if (!map.containsKey(Character.toString(input.charAt(i)))) {
                map.put(String.valueOf(input.charAt(i)), input.length() - input.replace(String.valueOf(input.charAt(i)), "").length());
            }
        }

        List<Map.Entry<String, Integer>> list = new LinkedList<>(map.entrySet());
        list.sort(Map.Entry.comparingByValue());

        if (list.size() > 1 && Objects.equals(list.get(list.size() - 1).getValue(), list.get(list.size() - 2).getValue()))
            bw.write("?");
        else bw.write(list.get(list.size() - 1).getKey());
        bw.close();
    }

}
