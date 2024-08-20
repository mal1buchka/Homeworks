package august_20.task_2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> list  = new LinkedList<>();
        addMillionElements(arrayList);
        addMillionElements(list);
        getRandomElement(arrayList);
        getRandomElement(list); // 48, 452 ms
        /*
        В ArrayList добавление элементов происходит быстро,
         и к ним можно быстро обращаться по индексу.

        Случайный доступ в ArrayList(по индексу)  происходит быстро,
        так как элементы хранятся последовательно в памяти(0,1,2 и тд)


        Добавление элементов: В LinkedList добавление элементов в конец списка происходит медленно,
        поскольку необходимо поддерживать связи между элементами (ссылки на следующий и предыдущий элементы).
         */
    }
    static void addMillionElements(List<Integer> list){
        for(int i = 0; i < 1000000; i++){
            list.add(i);
        }
    }
    static void getRandomElement(List<Integer> list){
        Random random = new Random();
        for(int i = 0; i < 1000000; i++){
            System.out.println(list.get(random.nextInt(list.size())));
            // 48,452
        }
    }

}
