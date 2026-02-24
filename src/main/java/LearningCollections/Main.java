package LearningCollections;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static void main(String[] args) {
//        List<String> names = new ArrayList<>();
//        names.add("Alex");
//        names.add("Michael");
//        names.add("Anthony");
//        names.add("Lee");
        List<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(5);
        numbers.add(2);
        numbers.add(2);
        numbers.add(0);
//        System.out.println(censorShortWords(names));
//        System.out.println(getTopThree(names));
//        System.out.println(uniqueOnly(numbers));
        System.out.println(numbers);
        System.out.println(reverseList(numbers));
    }

    public static List<String> censorShortWords(List<String> words) {
        for (int i = 0; i < words.size(); i++) {
            if (words.get(i).length() < 4) {
                words.set(i, "[CENSORED]");
            }
        }
        return words;
    }

    public static List<String> getTopThree(List<String> results) {
        List<String> result = new ArrayList<>();
        if (results.size() <= 3) {
            result = List.copyOf(results);
            return result;
        }
        for (int i = 0; i < 3; i++) {
            result.add(results.get(i));
        }
        return result;
    }

    public static List<Integer> uniqueOnly(List<Integer> nums) {
        List<Integer> result = new ArrayList<>();
        for (Integer num : nums) {
            if (!result.contains(num)) {
                result.add(num);
            }
        }
        return result;
    }

    public static List<Integer> reverseList(List<Integer> nums) {
        List<Integer> result = new ArrayList<>();
        for (int i = nums.size() - 1; i >= 0; i--) {
            result.add(nums.get(i));
        }
        return result;
    }
}
