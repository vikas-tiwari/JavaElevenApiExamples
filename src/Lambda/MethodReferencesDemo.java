package Lambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class MethodReferencesDemo {
    public static void main(String args[]) {
        //Consumer<String> c = s -> System.out.println(s);
        //Above statement can be written like this
        Consumer<String> c = System.out::print;
        Comparator<Integer> comp = Integer::compare;

        List<String> list = Arrays.asList("India","USA", "Canada");
        list.forEach(System.out::println);
    }
}
