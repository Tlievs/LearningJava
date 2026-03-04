package CollectionsLearning;

import java.util.*;

public class CollectionsImplementation {
    public boolean hasDuplicates(List<Integer> nums) {
        Set<Integer> result = new HashSet<>();
        for (Integer num : nums) {
            if (!result.add(num)) {
                return true;
            }
        }
        return false;
    }

    public List<Integer> getUnique(List<Integer> nums) {
        Set<Integer> unique = new HashSet<>(nums);
        return new ArrayList<Integer>(unique);
    }

    public Map<String, Integer> countWords(List<String> words) {
        Map<String, Integer> result = new HashMap<>();
        for (String word : words) {
            if(result.get(word) == null) {
                result.put(word, 1);
            } else {
                result.put(word, result.get(word) + 1);
            }
        }
        return result;
    }

    public String findPhone(String name, Map<String, String> phoneBook) {
        return phoneBook.getOrDefault(name, "Nothing found");
    }
}
