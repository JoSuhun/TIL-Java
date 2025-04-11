import java.util.*;

class Solution42862 {
    public int solution(int n, int[] lostArr, int[] reserveArr) {
        Arrays.sort(lostArr);
        Arrays.sort(reserveArr);

        List<Integer> lost = new ArrayList<>();
        List<Integer> reserve = new ArrayList<>();

        for (int l : lostArr) lost.add(l);
        for (int r : reserveArr) reserve.add(r);

        List<Integer> intersection = new ArrayList<>(reserve);
        intersection.retainAll(lost);

        for (int i : intersection) {
            lost.remove(Integer.valueOf(i));
            reserve.remove(Integer.valueOf(i));
        }

        for (int r : reserve) {
            if (lost.contains(r - 1)) {
                lost.remove(Integer.valueOf(r - 1));
            } else if (lost.contains(r + 1)) {
                lost.remove(Integer.valueOf(r + 1));
            }
        }

        return n - lost.size();
    }
}