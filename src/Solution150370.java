import java.util.*;
class Solution150370 {
    public int[] solution(String today, String[] terms, String[] privacies) {
        List<Integer> answerInt = new ArrayList<>();
        int[] todayInt = new int[3];
        int[] date = new int[3];
        String term = "";

        todayInt[0] =  Integer.parseInt(today.substring(0, 4));
        todayInt[1] =  Integer.parseInt(today.substring(5, 7));
        todayInt[2] =  Integer.parseInt(today.substring(8, 10));

        for(int i = 0; i < privacies.length; i++) {
            date[0] =  Integer.parseInt(privacies[i].substring(0, 4));
            date[1] =  Integer.parseInt(privacies[i].substring(5, 7));
            date[2] =  Integer.parseInt(privacies[i].substring(8, 10));
            term += privacies[i].charAt(11);
            for(String termPoint : terms) {
                if(term.equals(termPoint.charAt(0) + "")) {
                    date[1] += Integer.parseInt(termPoint.substring(2));
                    if(date[1] > 12) {
                        date[0] += date[1] / 12;
                        date[1] = date[1] % 12;
                    }
                    if(date[1] == 0) {
                        date[0]--;
                        date[1] = 12;
                    }

                    if(date[0] == todayInt[0]) {
                        if(date[1] == todayInt[1]) {
                            if(date[2] <= todayInt[2]) answerInt.add(i+1);
                        } else if(date[1] < todayInt[1]) answerInt.add(i+1);
                    } else if(date[0] < todayInt[0]) answerInt.add(i+1);
                }
            }
            term = "";
        }

        int[] answer = new int[answerInt.size()];
        for(int i = 0; i < answerInt.size(); i++) {
            answer[i] = answerInt.get(i);
        }

        return answer;
    }
}