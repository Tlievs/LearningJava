package CollectionsLearning;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    static void main() {
        CollectionsImplementation col = new CollectionsImplementation();
        List<Integer> someNums = new ArrayList<>(List.of(4,5,2,1,2,6,7));
        List<String> someWords = new ArrayList<>(List.of("hello", "bye", "hello"));
        Map<String, String> phoneBook = new HashMap<>();
        phoneBook.put("Mary", "123456789");
        phoneBook.put("Andrew", "987654321");
//        System.out.println(col.hasDuplicates(someNums));
//        System.out.println(col.getUnique(someNums));
//        System.out.println(col.countWords(someWords));
        System.out.println(col.findPhone("Mary", phoneBook));
        System.out.println(col.findPhone("Mary2", phoneBook));
    }
}
