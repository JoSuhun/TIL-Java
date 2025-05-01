import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Solution12909 {
    boolean solution(String s) {
        boolean answer = true;
        int left = 0;

        Queue<Character> stringsQ = s.chars().mapToObj(c->(char)c).collect(Collectors.toCollection(LinkedList::new));
        while (!stringsQ.isEmpty()) {
            Character next = stringsQ.poll();
            if (next.equals('(')) left ++;
            else if (next.equals(')')) left--;

            if (left<0) return false;
        }
        if (left>0) return false;

        return answer;
    }
}
