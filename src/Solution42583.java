import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.stream.Collectors;

public class Solution42583 {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 1;
        Queue<int[]> onBridgeQ = new LinkedList<>();
        Queue<Integer> onReadyQ = new LinkedList<>(Arrays.stream(truck_weights).boxed().collect(Collectors.toList()));
        int now = onReadyQ.poll();
        onBridgeQ.add(new int[]{now ,answer});
        int temp = now;
        int done = 0;
        while (!onBridgeQ.isEmpty()) {
            answer++;
            if (answer == bridge_length+onBridgeQ.peek()[1]) {
                temp -= onBridgeQ.peek()[0];
                onBridgeQ.poll();
                done = done +1;
            }
            if (!onReadyQ.isEmpty()) {
                if (temp+onReadyQ.peek() <= weight && onBridgeQ.size()<bridge_length) {
                    now = onReadyQ.poll();
                    onBridgeQ.add(new int[]{now, answer});
                    temp += now;

                }
            }
        }
        return answer;
    }
}
