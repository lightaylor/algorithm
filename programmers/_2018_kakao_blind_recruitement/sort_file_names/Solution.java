package programmers._2018_kakao_blind_recruitement.sort_file_names;

import java.util.Arrays;

class Solution {
    public String[] solution(String[] files) {
        Arrays.sort(files, (a, b) -> {
            String[] pa = a.split("(?<=\\D)(?=\\d)", 2);
            String[] pb = b.split("(?<=\\D)(?=\\d)", 2);

            int cmp = pa[0].compareToIgnoreCase(pb[0]);
            if (cmp != 0) return cmp;

            int numA = Integer.parseInt(pa[1].replaceAll("\\D.*", ""));
            int numB = Integer.parseInt(pb[1].replaceAll("\\D.*", ""));
            return Integer.compare(numA, numB);
        });
        return files;
    }
}
