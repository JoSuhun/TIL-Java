import java.util.Arrays;

public class Solution43163 {
    private int answer = Integer.MAX_VALUE;
    private boolean[] visited;
    private String[] words;
    private String target;

    public int solution(String begin, String target, String[] words) {
        this.words = words;
        this.target = target;
        visited = new boolean[words.length];

        if (!Arrays.asList(words).contains(target)) {
            return 0;
        }

        dfs(begin, 0);

        return answer == Integer.MAX_VALUE ? 0 : answer;
    }

    private void dfs(String now, int cnt) {
        if (now.equals(target)) {
            answer = Math.min(answer, cnt);
            return;
        }

        for (int i = 0; i < words.length; i++) {
            if (!visited[i] && canChange(now, words[i])) {
                visited[i] = true;
                dfs(words[i], cnt + 1);
                visited[i] = false;
            }
        }
    }

    private boolean canChange(String a, String b) {
        int diff = 0;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i)) {
                diff++;
            }
            if (diff > 1) return false;
        }
        return diff == 1;
    }
}
