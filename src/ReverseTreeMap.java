import java.util.Comparator;
import java.util.TreeMap;

/**
 * Created by ashwin on 21/11/17.
 */

public class ReverseTreeMap {

    public static void main(String[] args) {

        // Reverse tree
        TreeMap<Integer, String> reverseTreeMap = new TreeMap<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2>o1?1:o2==o1?0:-1;
            }
        });

        reverseTreeMap.put(1, "Alice");
        reverseTreeMap.put(5, "Blenda");
        reverseTreeMap.put(2, "Clara");
        reverseTreeMap.put(3, "Dennis");
        reverseTreeMap.put(4, "Erica");

        // Map will be sorted in descending order by keys
        System.out.println(reverseTreeMap.toString());

    }

}
