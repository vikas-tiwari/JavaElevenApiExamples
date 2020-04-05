package Lambda;

import java.util.ArrayList;
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
        List<String> result = new ArrayList<>();

        Consumer<String> c1 = System.out::println;
        Consumer<String> c2 = result:: add;
        list.forEach(c1.andThen(c2));
        System.out.println("Size of result list "+ result.size());


    }
}
