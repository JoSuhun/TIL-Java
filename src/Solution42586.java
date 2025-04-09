import java.util.*;

class Solution42586 {
    public int[] solution(int[] progresses, int[] speeds) {
        List<Integer> answerList = new ArrayList<>();
        int day = 0;
        int temp = 0;
        Queue<Integer> progressessQ = new LinkedList<>();
        Queue<Integer> speedsQ = new LinkedList<>();

        for (int progress : progresses) {
            progressessQ.offer(progress);
        }
        for (int speed: speeds) {
            speedsQ.offer(speed);
        }
        while (!progressessQ.isEmpty() && !speedsQ.isEmpty()) {
            int now = progressessQ.peek();
            int speed = speedsQ.peek();
            if (now + speed*day >= 100) {
                temp = temp+1;
                progressessQ.poll();
                speedsQ.poll();
            } else {
                if (temp >= 1) {
                    answerList.add(temp);
                    temp = 0;
                }
                day = day+1;
            }
        }
        answerList.add(temp);
        return answerList.stream().mapToInt(Integer::intValue).toArray();
    }
}