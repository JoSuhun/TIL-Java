import java.util.LinkedList;
import java.util.Queue;

class Solution1844 {

    private int bfs(int[][] maps, int yy, int xx) {
        int[][] direct = {{1, 0}, {0, 1}, {-1, 0}, {0, -1}};

        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{0, 0, 1});

        while (!queue.isEmpty()) {
            int[] now = queue.poll();
            int y = now[0];
            int x = now[1];
            int cnt = now[2];
            maps[y][x] = 0;
            if (y==yy-1 && x==xx-1) return cnt;
            for(int[] d : direct) {
                int dy = d[0];
                int dx = d[1];
                int nowy = dy+y;
                int nowx = dx+x;
                if (nowy>=0 && nowx>=0 && nowy<yy && nowx<xx && maps[nowy][nowx] == 1) {
                    queue.offer(new int[]{nowy, nowx, cnt+1});
                }
            }
        }
        return -1;
    }
    public int solution(int[][] maps) {
        int yy = maps.length;
        int xx = maps[0].length;
        return bfs(maps, yy, xx);
    }
}