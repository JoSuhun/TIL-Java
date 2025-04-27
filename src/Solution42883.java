import java.util.*;

public class Solution42883 {
    public String solution(String number, int k) {
        Stack<Character> stack = new Stack<>();

        for (char num : number.toCharArray()) {
            while (k > 0 && !stack.isEmpty() && stack.peek() < num) {
                stack.pop();
                k--;
            }
            stack.push(num);
        }

        while (k > 0) {
            stack.pop();
            k--;
        }

        StringBuilder sb = new StringBuilder();
        for (char c : stack) {
            sb.append(c);
        }

        return sb.toString();
    }
}
