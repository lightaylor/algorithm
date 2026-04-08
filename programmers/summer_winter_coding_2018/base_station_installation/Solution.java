package programmers.summer_winter_coding_2018.base_station_installation;

class Solution {
    public int solution(int n, int[] stations, int w) {
        int coverage = 2 * w + 1;
        int answer = 0;
        int prev = 1;

        for (int station : stations) {
            int gap = station - w - prev;
            if (gap > 0) answer += (gap + coverage - 1) / coverage;
            prev = station + w + 1;
        }

        int gap = n - prev + 1;
        if (gap > 0) answer += (gap + coverage - 1) / coverage;

        return answer;
    }
}
