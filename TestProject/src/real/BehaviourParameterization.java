package real;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class BehaviourParameterization {

    public static void main(String args[]) {
        List<Integer> elements = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        Function<Integer, Integer> integerFunction;
        integerFunction = x -> x * x;
        elements = getIntegers(elements, integerFunction);
        System.out.println(elements);
        integerFunction = x -> x * x * x;
        elements = getIntegers(elements, integerFunction);
        System.out.println(elements);
    }

    private static List<Integer> getIntegers(List<Integer> elements, Function<Integer, Integer> integerFunction) {
        elements = elements.stream().map(integerFunction).collect(Collectors.toList());
        return elements;
    }
}
