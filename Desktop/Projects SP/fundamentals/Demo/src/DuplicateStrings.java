import java.util.*;

public class DuplicateStrings {
    public static void main(String[] args) {
        String[] arr = {"Cabbage", "Kale", "Radish", "Onions", "Garlic", "Garlic", "Beetroot",
                "Onions", "Garlic", "Garlic", "Beetroot", "Cucumber", "Carrot", "Kale"};

        Set stringSet = new HashSet<>();
        List<String> duplicates = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            boolean isUnique = stringSet.add(arr[i]);
            if (!isUnique)
                duplicates.add(arr[i]);

        }

        HashMap<String, Integer> frequencies = new LinkedHashMap<>();

        for (String duplicate : duplicates) {
            frequencies.put(duplicate, Collections.frequency(duplicates, duplicate));
        }

        for (Map.Entry<String, Integer> frequency : frequencies.entrySet()) {
            System.out.println(frequency.getKey() + " " + frequency.getValue());
        }

    }
}
