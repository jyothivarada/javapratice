package real;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TestSample {
    public static void main(String args[]) {
        String[]  arr = {"a", "b", "c", "b"};
        Map<String,Integer> map1 = new HashMap<>();
        Arrays.stream(arr).forEach(e -> map1.put(e, map1.getOrDefault(e,0) + 1));
        List<Person> people = map1.keySet().stream().map(e -> new Person(e, map1.get(e))).sorted(Comparator.comparing(e -> e.rank, Comparator.reverseOrder())).collect(Collectors.toList());
        System.out.println(map1);
        System.out.println(people);
    }
}

class Person {
    String name;
    Integer rank;
    public Person(String name, Integer rank) {
        this.name = name;
        this.rank = rank;
    }
    @Override
    public String toString() {
        return this.name +"->" + this.rank;
    }
}
