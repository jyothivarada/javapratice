package real;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

public class FindSiblings {

    public static void main(String args[]) {

        int size = 9;
        int elements[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int findSib = 5;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 1; i < size; i = i * 2) {
            for (int j = i; j < i * 2 && j <= size; j++) {
                map.put(elements[j - 1], i);
            }
        }

        List<Integer> elemtentList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        int level = map.get(findSib);

        System.out.println(map
                .entrySet()
                .stream()
                .filter(entry -> Objects.equals(entry.getValue(), level))
                .filter(entry -> !Objects.equals(entry.getKey(), findSib))
                .map(Map.Entry::getKey)
                .collect(Collectors.toSet()));
    }
}




