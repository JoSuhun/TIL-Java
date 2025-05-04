import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.stream.Collectors;

public class Solution42626 {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Arrays.stream(scoville).boxed().collect(Collectors.toList()));
        while (!pq.isEmpty()) {
            int now = pq.poll();
            if (now>=K) break;
            if (pq.isEmpty()) return -1;
            int next = pq.poll();
            pq.add(now+next*2);
            answer=answer+1;
        }
        return answer;
    }
}
