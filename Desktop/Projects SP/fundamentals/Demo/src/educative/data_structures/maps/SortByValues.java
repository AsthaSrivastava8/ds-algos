package educative.data_structures.maps;

import java.util.*;

public class SortByValues {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(6, "Tushar");
        hashMap.put(12, "Ashu");
        hashMap.put(5, "Zoya");
        hashMap.put(78, "Yash");
        hashMap.put(10, "Praveen");
        hashMap.put(67, "Boby");
        hashMap.put(1, "Ritesh");
        System.out.println("Before Sorting");
        Iterator iterator = hashMap.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry map = (Map.Entry) iterator.next();
            System.out.println("Roll no:  " + map.getKey() + "     Name:   " + map.getValue());
        }

        Map<Integer, String> map = sortValues(hashMap);
        System.out.println("\n");
        System.out.println("After Sorting:");
        Iterator iterator2 = map.entrySet().iterator();
        while (iterator2.hasNext()) {
            Map.Entry me2 = (Map.Entry) iterator2.next();
            System.out.println("Roll no:  " + me2.getKey() + "     Name:   " + me2.getValue());
        }
    }

    private static Map<Integer, String> sortValues(HashMap<Integer, String> hashMap) {
        List list = new LinkedList(hashMap.entrySet());

        Collections.sort(list, (Comparator) (o1, o2) ->
                ((Comparable) ((Map.Entry) (o1)).getValue()).compareTo(((Map.Entry) (o2)).getValue()));

        Iterator iterator = list.iterator();

        HashMap<Integer, String> sortedMap = new HashMap<>();

        while (iterator.hasNext()) {
            Map.Entry value = (Map.Entry) iterator.next();
            sortedMap.put((Integer) value.getKey(), value.getValue().toString());
        }
        return sortedMap;
    }
}