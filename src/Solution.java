import java.util.*;

class Solution {
    // https://school.programmers.co.kr/learn/courses/30/lessons/178871?language=java
    // Lv.1 달리기경주
    // HashMap
    public String[] solution(String[] players, String[] callings) {
        Map<String, Integer> map = new HashMap<>();

        for(int i = 0; i < players.length; i++) {
            map.put(players[i], i);
        }

        for (String calling : callings) {
            int idx = map.get(calling);
            if (idx > 0) {
                String comp = players[idx-1];
                players[idx-1] = players[idx];
                players[idx] = comp;

                map.put(calling, idx-1);
                map.put(comp, idx);
            }
        }
    return players;
    }
}