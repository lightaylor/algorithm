import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        Arrays.sort(numbers);
        int a = numbers[numbers.length - 2] * numbers[numbers.length -1];
        int b = numbers[0] * numbers[1];
        return a > b ? a : b;
    }
}
