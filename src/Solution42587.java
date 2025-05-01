import java.util.*;

public class Solution42587 {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        Queue<int[]> q = new LinkedList<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for(int i = 0; i<priorities.length; i++) {
            q.add(new int[]{priorities[i], i});
            pq.add(priorities[i]);
        }

        while (!q.isEmpty()) {
            int[] now = q.poll();
            if (now[0] == pq.peek()) {
                answer ++;
                pq.poll();
                if (now[1] == location) {
                    return answer;
                }
            } else {
                q.add(now);
            }
        }

        return answer;
    }
}
