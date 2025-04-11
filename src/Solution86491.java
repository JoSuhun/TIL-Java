import java.util.Arrays;

class Solution86491 {
    public int solution(int[][] sizes) {
        int max_x = Arrays.stream(sizes[0]).max().getAsInt();
        int max_y = Arrays.stream(sizes[0]).min().getAsInt();
        for (int i = 1; i<sizes.length; i++) {
            int next_x = Arrays.stream(sizes[i]).max().getAsInt();
            int next_y = Arrays.stream(sizes[i]).min().getAsInt();
            max_x = Math.max(max_x, next_x);
            max_y = Math.max(max_y, next_y);
        }
        int answer = max_y*max_x;
        return answer;
    }
}