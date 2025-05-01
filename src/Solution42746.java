import java.util.Arrays;

public class Solution42746 {
    public String solution(int[] numbers) {

        String[] stringNumbers = Arrays.stream(numbers).mapToObj(String::valueOf).toArray(String[]::new);
        Arrays.sort(stringNumbers, (a, b)->(b+a).compareTo(a+b));
        if(stringNumbers[0].equals("0")) return "0";

        StringBuilder answer = new StringBuilder();
        for (String num : stringNumbers) {
            answer.append(num);
        }
        return answer.toString();
    }
}
