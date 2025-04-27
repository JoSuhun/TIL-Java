import java.util.*;

public class Solution42576 {
    public String solution(String[] participant, String[] completion) {
        String answer = "";

        PriorityQueue<String> pqParticipant = new PriorityQueue<>(Arrays.asList(participant));
        PriorityQueue<String> pqCompletion = new PriorityQueue<>(Arrays.asList(completion));

        while (!pqCompletion.isEmpty()) {
            String a = pqParticipant.poll();
            String b = pqCompletion.poll();
            if (!a.equals(b)) {
                answer = a;
                return answer;
            }
        }

        answer = pqParticipant.peek();
        return answer;
    }
}
