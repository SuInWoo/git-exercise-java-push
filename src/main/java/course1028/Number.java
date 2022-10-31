package course1028;
import java.util.*;

public class Number {
    public boolean solution(String[] phone_book) {
        boolean answer = true;

        Map<String, String> map = new HashMap<>();

        for(int i = 0; i < phone_book.length; i++) {
            map.put(phone_book[i], "");
        }

        for(String s : phone_book) {
            for(int i = 1; i < s.length(); i++) {
                if(map.containsKey(s.substring(0, i))) {
                    return false;
                }
            }
        }

        return answer;
    }
}