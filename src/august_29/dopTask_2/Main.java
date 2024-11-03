package august_29.dopTask_2;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("malik", "kuki", "beka", "azamat", "egor");
        Predicate<String> predicate = new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.length()>5;
            }
        };
       list.stream().filter(predicate).collect(Collectors.toList()).forEach(System.out::println);



    }
}
