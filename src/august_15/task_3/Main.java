package august_15.task_3;

public class Main {
    public static void main(String[] args) {
        String test = "23:59";
        String test2 = "12:60";
        System.out.println(isItValidTime(test)); // true
        System.out.println(isItValidTime(test2)); //false
    }
    public static boolean isItValidTime(String time){
        return time.matches("^([01]d|2[0-3]):[0-5][0-9]$");
    }
}
