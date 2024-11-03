package august_29.dopTask_1;

import java.util.ArrayList;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Random random = new Random();
            list.add(random.nextInt(0, 10));
        }
        list.stream().sorted().collect(Collectors.toList()).forEach(System.out::println); //  С помощью Streams
        list.sort((a,b) -> Integer.compare(a,b)); // IDE сама посказывает ссылку на метод использовать,
        list.sort(Integer::compare);
        System.out.println("----------------------");
        list.forEach(System.out::println);

    }
}
