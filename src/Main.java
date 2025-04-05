public class Main {
    public static void main(String[] args) {
        String[] cards1 = {"i", "drink", "water"};
        String[] cards2 = {"want", "to"};
        String[] goal = {"i", "want", "to", "drink", "water"};

        Solution159994 Solution = new Solution159994();
        System.out.println(Solution.solution(cards1, cards2, goal));
    }
}