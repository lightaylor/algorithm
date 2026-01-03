package _2020_kakao_internship.press_the_keypad;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public String solution(int[] numbers, String hand) {
        StringBuilder answer = new StringBuilder();

        Map<Integer, int[]> phone = initPhone();
        char handPos = hand.equals("right") ? 'R' : 'L';
        int[] leftPos = {3, 0};
        int[] rightPos = {3, 2};

        for (int number : numbers) {
            int[] pos = phone.get(number);

            if (number == 1 || number == 4 || number == 7) {
                leftPos = pos;
                answer.append('L');
                continue;
            }

            if (number == 3 || number == 6 || number == 9) {
                rightPos = pos;
                answer.append('R');
                continue;
            }

            int leftDistance = getDistance(leftPos, pos);
            int rightDistance = getDistance(rightPos, pos);

            if (leftDistance < rightDistance) {
                leftPos = pos;
                answer.append("L");
            } else if (leftDistance > rightDistance) {
                rightPos = pos;
                answer.append("R");
            } else {
                if (handPos == 'R') rightPos = pos;
                else leftPos = pos;
                answer.append(handPos);
            }
        }

        return answer.toString();
    }

    private static Map<Integer, int[]> initPhone() {
        Map<Integer, int[]> phone = new HashMap<>();
        phone.put(1, new int[]{0, 0});
        phone.put(2, new int[]{0, 1});
        phone.put(3, new int[]{0, 2});
        phone.put(4, new int[]{1, 0});
        phone.put(5, new int[]{1, 1});
        phone.put(6, new int[]{1, 2});
        phone.put(7, new int[]{2, 0});
        phone.put(8, new int[]{2, 1});
        phone.put(9, new int[]{2, 2});
        phone.put(0, new int[]{3, 1});

        return phone;
    }

    private static int getDistance(int[] pos1, int[] pos2) {
        return Math.abs(pos1[0] - pos2[0]) + Math.abs(pos1[1] - pos2[1]);
    }
}
