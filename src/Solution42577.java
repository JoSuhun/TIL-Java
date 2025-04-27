import java.util.*;

public class Solution42577 {
    public boolean solution(String[] phone_book) {
        Arrays.sort(phone_book);

        for (int i = 0; i < phone_book.length - 1; i++) {
            String num = phone_book[i];
            String next = phone_book[i + 1];

            if (next.startsWith(num)) {
                return false;
            }
        }

        return true;
    }
}
