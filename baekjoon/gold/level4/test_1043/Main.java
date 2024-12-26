package gold.level4.test_1043;

import java.util.*;

public class Main {

    private static int N;
    private static int M;
    private static int answer;
    private static boolean[] truth;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();

        answer = M;
        int count = sc.nextInt();
        if (count > 0) {
            truth = new boolean[N + 1];
            Queue<Integer> queue = new LinkedList<>();
            for (int i = 0; i < count; i++) {
                int men = sc.nextInt();
                truth[men] = true;
                queue.add(men);
            }

            List<Integer>[] party = new List[M];
            for (int i = 0; i < M; i++) {
                party[i] = new ArrayList<>();
            }

            List<Integer>[] attendedPlace = new List[N + 1];
            for (int i = 0; i <= N; i++) {
                attendedPlace[i] = new ArrayList<>();
            }

            for (int i = 0; i < M; i++) {
                int c = sc.nextInt();
                for (int j = 0; j < c; j++) {
                    int num = sc.nextInt();
                    party[i].add(num);
                    attendedPlace[num].add(i);
                }
            }

            truth = new boolean[N + 1];
            while (!queue.isEmpty()) {
                int current = queue.poll();
                truth[current] = true;

                for (int i : attendedPlace[current]) {
                    for (int j : party[i]) {
                        if (!truth[j]) {
                            queue.add(j);
                        }
                    }
                }
            }
            for (List<Integer> list : party) {
                boolean check = true;
                for (int men : list) {
                    if (!truth[men]) {
                        check = false;
                        break;
                    }
                }
                if (check) {
                    answer--;
                }
            }
        }
        System.out.print(answer);
    }
}
