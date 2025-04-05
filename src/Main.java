import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] name = {"may", "kein", "kain", "radi"};
        int[] yearning = {5, 10, 1, 3};
        String[][] photo ={{"may", "kein", "kain", "radi"},{"may", "kein", "brin", "deny"}, {"kon", "kain", "may", "coni"}};

        Solution Solution = new Solution();
        System.out.println(Arrays.toString(Solution.solution(name, yearning, photo)));
    }
}