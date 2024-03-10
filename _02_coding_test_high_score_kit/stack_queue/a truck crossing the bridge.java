import java.util.*;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        Queue<Integer> truck = convert(truck_weights);
        Queue<Integer> bridge = new LinkedList();
        int answer = bridge_length;

        while(!truck.isEmpty()) {
            if(bridge.size() >= bridge_length) {
                bridge.poll();
            }
            if(truck.peek() != null && truck.peek() + sum(bridge) <= weight) {
                bridge.add(truck.poll());
            } else {
                bridge.add(0);
            }
            answer += 1;
        }

        return answer;
    }

    public int sum(Queue<Integer> q) {
        int result = 0;

        for(int i : q) {
            result += i;
        }

        return result;
    }

    public Queue convert(int[] truck) {
        Queue<Integer> result = new LinkedList();

        for(int i : truck) {
            result.add(i);
        }

        return result;
    }
}
