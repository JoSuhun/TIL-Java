import java.util.Stack;

class Solution12906 {
    public int[] solution (int[] arr) {
        Stack<Integer> stack = new Stack<>();
        for (int a : arr) {
            if (!stack.isEmpty() && stack.peek() == a) {
                continue;
            }
            stack.push(a);
        }
        return stack.stream().mapToInt(Integer::intValue).toArray();
    }
}
