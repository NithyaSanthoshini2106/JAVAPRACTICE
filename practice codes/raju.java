



import java.util.*;

public class raju {

    static class Cell {
        int x, y, dist;
        Cell(int x, int y, int dist) {
            this.x = x;
            this.y = y;
            this.dist = dist;
        }
    }
    public static int findShortestPath(int[][] v, int a, int b, int c, int d, int n, int m) {
        if (a < 0 || a >= n || b < 0 || b >= m) return -1;
        if (c < 0 || c >= n || d < 0 || d >= m) return -1;
        if (v[a][b] != 1 || v[c][d] != 1) return -1;

        boolean[][] visited = new boolean[n][m];
        Queue<Cell> q = new LinkedList<>();

        q.add(new Cell(a, b, 1));
        visited[a][b] = true;
        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};

        while (!q.isEmpty()) {
            Cell curr = q.poll();

            if (curr.x == c && curr.y == d)
                return curr.dist;

            for (int i = 0; i < 4; i++) {
                int nx = curr.x + dx[i];
                int ny = curr.y + dy[i];

                if (nx >= 0 && nx < n && ny >= 0 && ny < m &&
                    !visited[nx][ny] && v[nx][ny] == 1) {

                    visited[nx][ny] = true;
                    q.add(new Cell(nx, ny, curr.dist + 1));
                }
            }
        }

        return -1; 
    }
}
