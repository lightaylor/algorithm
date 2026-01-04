package brute_force_search.fatigue;

class Solution {
    private static int[][] dungeonsArr;
    private static boolean[] visited;
    private static int maxCount;

    public int solution(int k, int[][] dungeons) {
        visited = new boolean[dungeons.length];
        dungeonsArr = dungeons;
        maxCount = 0;

        dfs(k, 0);

        return maxCount;
    }

    private static void dfs(int k, int count) {
        maxCount = Math.max(maxCount, count);

        for (int i = 0; i < dungeonsArr.length; i++) {
            if (!visited[i] && k >= dungeonsArr[i][0]) {
                visited[i] = true;
                dfs(k - dungeonsArr[i][1], count + 1);
                visited[i] = false;
            }
        }
    }
}
