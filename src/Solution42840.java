import java.util.*;
import java.util.stream.Collectors;

public class Solution42840 {

    private int find(int[] answers, int[] point) {
        int cnt = 0;

        List<Integer> copiedAnswers = Arrays.stream(answers).boxed().collect(Collectors.toList());
        List<Integer> copiedPoint = Arrays.stream(point).boxed().collect(Collectors.toList());

        while (copiedAnswers.size() > 0) {
            int ans = copiedAnswers.remove(0);
            int p = copiedPoint.remove(0);
            if (ans == p) cnt++;
            copiedPoint.add(p);
        }

        return cnt;
    };

    public int[] solution(int[] answers) {
        List<Integer> answerList = new ArrayList<>();
        int[][] points = {{1, 2, 3, 4, 5},{2, 1, 2, 3, 2, 4, 2, 5},{3, 3, 1, 1, 2, 2, 4, 4, 5, 5}};
        List<Integer> temp = new ArrayList<>();
        for (int[] point : points) {
            temp.add(find(answers, point));
        }
        int MAX = temp.stream().max(Integer::compareTo).orElse(-1);
        for(int i = 0 ; i<points.length; i++) {
            if(find(answers, points[i])==MAX) {
                answerList.add(i+1);
            }
        }

        int[] answer = new int[answerList.size()];
        for(int i = 0; i < answerList.size(); i++) {
            answer[i] = answerList.get(i);
        }
        return answer;
    }
}
