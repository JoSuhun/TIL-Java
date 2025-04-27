import java.util.*;

public class Solution43164 {
    public String[] solution(String[][] tickets) {
        List<String> answer = new ArrayList<>();
        Arrays.sort(tickets, (a, b) -> {
            if (a[0].equals(b[0])) {
                return a[1].compareTo(b[1]);
            } else {
                return a[0].compareTo(b[0]);
            }
        });

        Queue<Node> queue = new LinkedList<>();
        queue.offer(new Node(new ArrayList<>(List.of("ICN")), tickets));

        while (!queue.isEmpty()) {
            Node now = queue.poll();
            List<String> route = now.route;
            String[][] leftTickets = now.leftTickets;

            if (leftTickets.length == 0) {
                answer = route;
                break;
            }

            for (int i = 0; i < leftTickets.length; i++) {
                if (route.get(route.size() - 1).equals(leftTickets[i][0])) {
                    List<String> newRoute = new ArrayList<>(route);
                    newRoute.add(leftTickets[i][1]);

                    String[][] newTickets = new String[leftTickets.length - 1][2];
                    int idx = 0;
                    for (int j = 0; j < leftTickets.length; j++) {
                        if (i == j) continue;
                        newTickets[idx++] = leftTickets[j];
                    }
                    queue.offer(new Node(newRoute, newTickets));
                }
            }
        }

        return answer.toArray(new String[0]);
    }

    static class Node {
        List<String> route;
        String[][] leftTickets;

        Node(List<String> route, String[][] leftTickets) {
            this.route = route;
            this.leftTickets = leftTickets;
        }
    }
}
