import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] players = {"mumu", "soe", "poe", "kai", "mine"};
        String[] callings = {"kai", "kai", "mine", "mine"};

        Solution Solution = new Solution();
        System.out.println(Arrays.toString(Solution.solution(players, callings)));
    }
}