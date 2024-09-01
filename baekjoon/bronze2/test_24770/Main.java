package bronze2.test_24770;

import java.io.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] arr = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        while (arr[0] != 0 || arr[1] != 0) {
            int n = arr[0];
            int m = arr[1];

            int bestTickets = 0;
            int bestPrice = Integer.MAX_VALUE;

            for (int i = 0; i < n; i++) {
                int[] offer = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
                int tickets = offer[0];
                int price = offer[1];

                if (tickets <= m) {
                    double currentPricePerTicket = (double) price / tickets;
                    double bestPricePerTicket = (double) bestPrice / bestTickets;

                    if (bestTickets == 0 || currentPricePerTicket < bestPricePerTicket ||
                            (currentPricePerTicket == bestPricePerTicket && tickets > bestTickets)) {
                        bestTickets = tickets;
                        bestPrice = price;
                    }
                }
            }

            if (bestPrice != Integer.MAX_VALUE) {
                bw.write("Buy " + bestTickets + " tickets for $" + bestPrice);
            } else {
                bw.write("No suitable tickets offered");
            }
            bw.newLine();

            arr = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        }
        bw.close();
    }
}
