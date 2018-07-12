import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class Elections {

    public static void main(String[] args) {
        String[] votes = {"Alex", "Michael", "Harry", "Dave", "Michael", "Victor", "Harry", "Alex", "Mary", "Mary"};
        TreeMap<String, Integer> map = new TreeMap<>(Collections.reverseOrder());
        for (String vote : votes) {
            if (map.containsKey(vote)) {
                map.put(vote, map.get(vote) + 1);
            } else {
                map.put(vote, 1);
            }
        }
        System.out.println(Collections.max(map.entrySet(), Map.Entry.comparingByValue()).getKey());
    }
}