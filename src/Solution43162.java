import java.util.LinkedList;
import java.util.Queue;

class Solution43162 {

    private void bfs(int n, int idx, int[] visited, int[][] computers) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(idx);
        while (!queue.isEmpty()) {
            int now = queue.poll();
            visited[now] = 1;
            for (int i = 0; i<n; i++) {
                if (i != now && visited[i] != 1 && computers[now][i] == 1) {
                    queue.add(i);
                }
            }
        }
    }
    public int solution(int n, int[][] computers) {
        int answer = 0;
        int[] visited = new int[n];
        for (int idx = 0; idx<n ; idx++) {
            if (visited[idx] == 0) {
                bfs(n, idx, visited, computers);
                answer ++;
            }
        }
        return answer;
    }
}