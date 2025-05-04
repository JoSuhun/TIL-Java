public class Solution87946 {
    private static int answer = -1;
    private static int[] visited;

    private void dfs(int pirodo, int cnt, int[][] dungeons) {
        answer = Math.max(answer, cnt);
        for (int i = 0; i<dungeons.length; i++) {
            if (pirodo >= dungeons[i][0] && visited[i]== 0) {
                visited[i] = 1;
                dfs(pirodo-dungeons[i][1], cnt+1, dungeons);
                visited[i] = 0;
            }
        }
    }
    public int solution(int k, int[][] dungeons) {
        answer = -1;
        visited = new int[dungeons.length];
        dfs(k, 0, dungeons);
        return answer;
    }

}
