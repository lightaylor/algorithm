import java.util.*;
import java.lang.Math;

class Solution {
    public int solution(int a, int b, int c, int d) {
        int answer = 0;
        int[] arr = { a, b, c, d };
        Map<Integer, Integer> map = new HashMap<>();

        for (int i : arr) {
            int v = map.containsKey(i) ? map.get(i) + 1 : 1;
            map.put(i, v);
        }

        Arrays.sort(arr);
        int max =  Collections.max(map.values());
        int min =  Collections.min(map.values());
        if (map.size() == 1) answer = 1111 * a;
        else if (map.size() == 2 && max == 3) {
            if(arr[0] == arr[1]) answer = (10 * arr[0] + arr[3])*(10 * arr[0] + arr[3]);
            else answer = (10 * arr[3] + arr[0])*(10 * arr[3] + arr[0]);
        }
        else if (map.size() == 2) {
            answer = (arr[0] + arr[2]) * Math.abs(arr[0] - arr[2]);
        }
        else if (map.size() == 3) {
            if (arr[0] == arr[1]) {
                answer = arr[2] * arr[3];
            } else if (arr[1] == arr[2]) {
                answer = arr[0] * arr[3];
            } else if (arr[2] == arr[3]) {
                answer = arr[0] * arr[1];
            }
        }
        else if (map.size() == 4) answer = arr[0];
        return answer;
    }
}
