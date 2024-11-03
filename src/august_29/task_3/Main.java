package august_29.task_3;

public class Main {
    public static void main(String[] args) {
        MyFunctionalInterface test = (a,b) -> a+b;
        System.out.println(test.sum(2,9));
    }
}
