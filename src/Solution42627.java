import java.util.PriorityQueue;

public class Solution42627 {
    public int solution(int[][] jobs) {
        int answer = 0;
        int now = 0;
        int ready = 0;
        int start = -1;
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b)->a[0]-b[0]);

        while (ready < jobs.length) {
            for (int[] job : jobs) {
                if (start < job[0] && job[0] <= now) {
                    pq.add(new int[]{job[1], job[0]});
                }
            }
            if (!pq.isEmpty()) {
                int[] cur = pq.poll();
                start = now;
                now += cur[0];
                answer += (now-cur[1]);
                ready += 1;
            } else {
                now += 1;
            }
        }

        return answer/jobs.length;
    }
}