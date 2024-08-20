package august_20.task_1;

import java.util.Collection;
import java.util.HashSet;


public class Unique {
     <T> Collection<T> unique(Collection<T> c) {
         return new HashSet<>(c);
    }
}
