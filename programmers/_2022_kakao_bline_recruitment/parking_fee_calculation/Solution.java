package programmers._2022_kakao_bline_recruitment.parking_fee_calculation;

import java.util.*;

class Solution {
    public int[] solution(int[] fees, String[] records) {
        Map<String, Integer> totalTimes = new HashMap<>();
        Map<String, Integer> inTimes = new HashMap<>();

        for (String record : records) {
            String[] split = record.split(" ");
            int minutes = toMinutes(split[0]);
            String carNumber = split[1];

            if (split[2].equals("IN")) {
                inTimes.put(carNumber, minutes);
            } else {
                totalTimes.put(carNumber, totalTimes.getOrDefault(carNumber, 0) + minutes - inTimes.remove(carNumber));
            }
        }

        for (String carNumber : inTimes.keySet()) {
            totalTimes.put(carNumber, totalTimes.getOrDefault(carNumber, 0) - inTimes.get(carNumber) + toMinutes("23:59"));
        }

        List<String> cars = new ArrayList<>(totalTimes.keySet());
        Collections.sort(cars);

        int[] answer = new int[cars.size()];
        for (int i = 0; i < cars.size(); i++) {
            if (totalTimes.get(cars.get(i)) <= fees[0]) {
                answer[i] = fees[1];
                continue;
            }
            answer[i] = (int) (fees[1] + Math.ceil((float) (totalTimes.get(cars.get(i)) - fees[0]) / fees[2]) * fees[3]);
        }

        return answer;
    }

    private int toMinutes(String time) {
        String[] t = time.split(":");
        return Integer.parseInt(t[0]) * 60 + Integer.parseInt(t[1]);
    }
}
