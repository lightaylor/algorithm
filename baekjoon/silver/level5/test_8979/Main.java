package baekjoon.silver.level5.test_8979;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        List<Country> countries = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int id = sc.nextInt();
            int gold = sc.nextInt();
            int silver = sc.nextInt();
            int bronze = sc.nextInt();
            countries.add(new Country(id, gold, silver, bronze));
        }

        Collections.sort(countries);

        Map<Integer, Integer> rankMap = new HashMap<>();
        int rank = 1;
        for (int i = 0; i < n; i++) {
            if (i > 0 && countries.get(i).compareTo(countries.get(i - 1)) != 0) {
                rank = i + 1;
            }
            rankMap.put(countries.get(i).id, rank);
        }
        System.out.print(rankMap.get(k));
    }
}

class Country implements Comparable<Country> {
    int id, gold, silver, bronze;

    public Country(int id, int gold, int silver, int bronze) {
        this.id = id;
        this.gold = gold;
        this.silver = silver;
        this.bronze = bronze;
    }

    @Override
    public int compareTo(Country o) {
        if (this.gold != o.gold) return o.gold - this.gold;
        if (this.silver != o.silver) return o.silver - this.silver;
        return o.bronze - this.bronze;
    }
}
