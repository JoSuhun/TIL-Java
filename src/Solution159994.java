class Solution159994 {
    // https://school.programmers.co.kr/learn/courses/30/lessons/159994
    // Lv.1 카드 뭉치
    // array
    public String solution(String[] cards1, String[] cards2, String[] goal) {

        int idx1 = 0;
        int idx2 = 0;

        for (String card : goal) {
            if (idx1 < cards1.length && card.equals(cards1[idx1])) {
                idx1++;
            } else if (idx2 < cards2.length && card.equals(cards2[idx2])) {
                idx2++;
            } else {
                return "No";
            }
        }

        return "Yes";
    }
}