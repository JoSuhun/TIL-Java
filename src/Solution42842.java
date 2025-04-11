class Solution42842 {
    public int[] solution(int brown, int yellow) {
        int[] answer = {};
        int w = 3;
        int h = 3;
        int total = brown + yellow;
        while (true) {
            h = total/w;
            if (w>=h && ((w-2)*(h-2)==yellow) && (total % h == 0)) {
                break;
            }
            w++;
        }
        answer = new int[]{w, h};
        return answer;
    }
}