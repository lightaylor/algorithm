package programmers.summer_winter_coding_2018.visit_length;

class Solution {
    public int solution(String dirs) {
        boolean[][][] visited = new boolean[11][11][4];

        int x = 5, y = 5;
        int answer = 0;

        int[] dx = {0, 0, 1, -1};
        int[] dy = {1, -1, 0, 0};

        for (char c : dirs.toCharArray()) {

            int dir;
            if (c == 'U') dir = 0;
            else if (c == 'D') dir = 1;
            else if (c == 'R') dir = 2;
            else dir = 3;

            int nx = x + dx[dir];
            int ny = y + dy[dir];

            if (nx < 0 || nx > 10 || ny < 0 || ny > 10) continue;

            if (!visited[x][y][dir]) {
                visited[x][y][dir] = true;
                visited[nx][ny][dir ^ 1] = true;
                answer++;
            }

            x = nx;
            y = ny;
        }

        return answer;
    }
}
