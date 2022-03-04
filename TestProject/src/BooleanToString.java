import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class BooleanToString {

    public static void main(String[] args) {
        List<Boolean> list = new ArrayList<>();
        list.add(Boolean.TRUE);
        list.add(Boolean.FALSE);
        list.add(Boolean.TRUE);

        System.out.println(list.stream().map(e -> e.toString()).collect(Collectors.toList()));
        System.out.println(list.stream().map(String::valueOf).collect(Collectors.toList()));
    }
}
